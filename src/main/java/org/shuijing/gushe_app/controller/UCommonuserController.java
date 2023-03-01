package org.shuijing.gushe_app.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.shuijing.gushe_app.common.JwtUtils;
import org.shuijing.gushe_app.common.Result;
import org.shuijing.gushe_app.pojo.MailRequest;
import org.shuijing.gushe_app.pojo.RCostrecord;
import org.shuijing.gushe_app.pojo.UCommonuser;
import org.shuijing.gushe_app.service.RCostrecordService;
import org.shuijing.gushe_app.service.SendMailService;
import org.shuijing.gushe_app.service.UCommonuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.UUID;

/**
 * <p>
 * 普通用户表,前半部分是注册时传给后台的，后面的是注册后必须补全的 前端控制器
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@RestController
@RequestMapping("/uCommonuser")
public class UCommonuserController {

    @Autowired
    private UCommonuserService uCommonuserService;

    @Autowired     //消费记录
    private RCostrecordService rCostrecordService;

    @Autowired     //邮件发送
    private SendMailService sendMailService;

    /**
     * 用户注册
     *
     * @param uCommonuser
     * @return
     */
    @PostMapping("/regi")
    @Transactional   //加个事务
    public Result register(@RequestBody UCommonuser uCommonuser) {
        //前端传过来email和password,将password加密
        String password = uCommonuser.getPwd();
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        uCommonuser.setPwd(password);

        //将传过来的email、password、再加上其余数据，传入数据库
        uCommonuser.setRegiDate(LocalDate.now()); //注册日期
        uCommonuser.setStatus(3); //设定状态为需要完善信息
        uCommonuser.setVipGoal(0);  //设定积分
        uCommonuser.setVipGrade("白银会员");  //设定会员等级
        uCommonuser.setMoney(10.0);    //设定初始金额
        try {
            uCommonuserService.save(uCommonuser);//传入数据库，新增一个用户
        } catch (Exception e) {    //判断用户存在与否
            return Result.error(100, "该用户已存在");
        }


        //用户新增时赠送了10元，需要写入用户消费记录表
        RCostrecord rCostrecord = new RCostrecord();
        rCostrecord.setEmail(uCommonuser.getEmail());
        rCostrecord.setMoney(10.0);
        rCostrecord.setCost(false);
        rCostrecord.setOrderId("无");
        rCostrecord.setComment("注册赠送金");
        rCostrecordService.save(rCostrecord);
        return Result.success("成功新增用户");
    }

    /**
     * 用户修改个人信息和注册时完善个人信息
     *
     * @param uCommonuser
     * @return
     */
    @PutMapping("/userinfoManage")
    public Result userinfoComplete(@RequestBody UCommonuser uCommonuser) {

        //将前端传过来的用户个人信息都写入表中
        uCommonuser.setStatus(1);  //将用户状态更新
        uCommonuserService.updateById(uCommonuser);

        return Result.success("个人信息修改成功！");
    }

    /**
     * 用户登陆
     * 前端传：用户名，密码
     * 后端放回：000 封禁 100密码错误或没有注册 200成功登陆，返回信息 300没有补全信息，去补全
     *
     * @param uCommonuser
     * @return
     */

    @PostMapping("/login")
    public Result userLogin(@RequestBody UCommonuser uCommonuser) {
        System.out.println("接收到登陆消息:"+uCommonuser.toString());
        //?1.密码加密
        String password = uCommonuser.getPwd();
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        //?2。密码比对
        LambdaQueryWrapper<UCommonuser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UCommonuser::getEmail, uCommonuser.getEmail());
        UCommonuser user = uCommonuserService.getOne(queryWrapper);

        //如果没有查询到，返回登陆失败
        if (user == null || !user.getPwd().equals(password)) {
            System.out.println("没有该用户或用户密码错误");
            return Result.error(100, "没有该用户或用户密码错误");
        }

        //该用户没有补全信息，
        if (user.getStatus() == 3) {
            System.out.println("该用户没有补全信息");
            return Result.error(300, "该用户没有补全信息");
        }
        //该用户已被封禁
        if (user.getStatus() == 0) {
            System.out.println("该用户被封禁");
            return Result.error(0, "该用户被封禁");
        }

        //?3。返回用户所有信息给前端。(密码正确)，但是要去掉密码
        user.setPwd("000");
        // ?4。返回token和信息
        String Token = JwtUtils.createToken();    //新建token
        return Result.success(user).add("token", Token);
    }

    /**
     * 忘记密码的操作 前端传送 ： email
     * @param uCommonuser 的email
     * @return
     */
    @PutMapping("/forgetPwd")
    public Result forgetPwd(@RequestBody UCommonuser uCommonuser){

        //?通过email来查询该用户
        System.out.println("忘记密码:"+uCommonuser.getEmail());
        LambdaQueryWrapper<UCommonuser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UCommonuser::getEmail, uCommonuser.getEmail());
        UCommonuser user = uCommonuserService.getOne(queryWrapper);

        if (user==null || user.getStatus()!=1){   //?用户不存在，返回错误 100
            return Result.error(100,"该用户不存在,或者状态不对，无法更改密码");
        }
        //?用户存在，将密码更改为UUID，并且发送email给该用户的email
        String newPwd = String.valueOf(UUID.randomUUID());//!生成临时密码
        //密码加密，然后更新到数据库中
        String password = DigestUtils.md5DigestAsHex(newPwd.getBytes());
        user.setPwd(password);
        uCommonuserService.updateById(user);

        //!将新密码发送给用户的email
        MailRequest mailRequest = new MailRequest(); //邮件初始化
        mailRequest.setText(newPwd);    //内容
        mailRequest.setSendTo(uCommonuser.getEmail());   //发送给某人
        mailRequest.setSubject("hello，"+user.getNickName()+"。这是您的新密码");
        sendMailService.sendSimpleMail(mailRequest);     //发送邮件
        return Result.success("成功");



    }



}

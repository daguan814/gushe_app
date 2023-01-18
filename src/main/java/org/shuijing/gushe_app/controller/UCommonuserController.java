package org.shuijing.gushe_app.controller;

import org.shuijing.gushe_app.common.Result;
import org.shuijing.gushe_app.pojo.RCostrecord;
import org.shuijing.gushe_app.pojo.UCommonuser;
import org.shuijing.gushe_app.service.RCostrecordService;
import org.shuijing.gushe_app.service.UCommonuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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

    @Autowired
    private RCostrecordService rCostrecordService;


    @PostMapping("/regi")
    @Transactional   //加个事务
    public Result register(@RequestBody UCommonuser uCommonuser){
            //前端传过来email和password,将password加密
        String password = uCommonuser.getPwd();
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        uCommonuser.setPwd(password);

        //将传过来的email、password、再加上其余数据，传入数据库
        uCommonuser.setRegiDate(LocalDate.now()); //注册日期
        uCommonuser.setStatus(1); //设定状态为可用
        uCommonuser.setVipGoal(0);  //设定积分
        uCommonuser.setVipGrade("白银会员");  //设定会员等级
        uCommonuser.setMoney(10.0);    //设定初始金额
        try {
            uCommonuserService.save(uCommonuser);//传入数据库，新增一个用户
        }catch (Exception e){    //判断用户存在与否
            return Result.error(100,"该用户已存在");
        }


        //用户新增时赠送了10元，需要写入用户消费记录表
        RCostrecord rCostrecord = new RCostrecord();
        rCostrecord.setEmail(uCommonuser.getEmail());
        rCostrecord.setMoney(10.0);
        rCostrecord.setCost(false);
        rCostrecord.setOrderId("无");
        rCostrecord.setComment("注册赠送金");
        rCostrecordService.save(rCostrecord);
        return  Result.success("成功新增用户");
    }

    @PostMapping("/userinfoManage")
    public Result userinfoComplete(@RequestBody UCommonuser uCommonuser){

        //将前端传过来的用户个人信息都写入表中
        uCommonuserService.updateById(uCommonuser);

        return  Result.success("个人信息完善成功！");
    }

}

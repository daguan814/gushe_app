package org.shuijing.gushe_app.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.shuijing.gushe_app.common.Result;
import org.shuijing.gushe_app.pojo.EAdmin;
import org.shuijing.gushe_app.service.EAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 管理员信息表,所有信息必须先设定好，都不能为空 前端控制器
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@RestController
@RequestMapping("/eAdmin")
public class EAdminController {

    @Autowired
    private EAdminService eAdminService;

    @PostMapping("/login")
    public Result adminLogin(@RequestBody EAdmin admin){
//        通过用户名查询数据库
        LambdaQueryWrapper<EAdmin> querywrapper = new LambdaQueryWrapper();
        querywrapper.eq(EAdmin::getLoginId,admin.getLoginId());
        EAdmin admin1 = eAdminService.getOne(querywrapper);



        return  Result.success(admin1).add("token","123123");
    }


}

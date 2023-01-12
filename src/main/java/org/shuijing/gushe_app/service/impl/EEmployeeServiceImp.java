package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.EEmployee;
import org.shuijing.gushe_app.dao.EEmployeeDao;
import org.shuijing.gushe_app.service.EEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表，前半部分是管理员添加员工时必填的，后面是员工第一次登陆时需要完善的信息，信息需要给管理员审批 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class EEmployeeServiceImp extends ServiceImpl<EEmployeeDao, EEmployee> implements EEmployeeService {

}

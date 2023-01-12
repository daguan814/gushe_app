package org.shuijing.gushe_app.service;

import org.shuijing.gushe_app.pojo.EEmployee;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 员工信息表，前半部分是管理员添加员工时必填的，后面是员工第一次登陆时需要完善的信息，信息需要给管理员审批 服务类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
public interface EEmployeeService extends IService<EEmployee> {

}

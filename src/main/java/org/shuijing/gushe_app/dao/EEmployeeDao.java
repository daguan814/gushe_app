package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.EEmployee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息表，前半部分是管理员添加员工时必填的，后面是员工第一次登陆时需要完善的信息，信息需要给管理员审批 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface EEmployeeDao extends BaseMapper<EEmployee> {

}

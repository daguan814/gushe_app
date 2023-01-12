package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.EMaster;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 摄影师、服装师、化妆师信息表，前半部分是管理员添加时必填的，后面是第一次登陆时需要完善的信息，信息需要给管理员或者员工审批 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface EMasterDao extends BaseMapper<EMaster> {

}

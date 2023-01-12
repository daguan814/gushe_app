package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.EAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 管理员信息表,所有信息必须先设定好，都不能为空 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface EAdminDao extends BaseMapper<EAdmin> {

}

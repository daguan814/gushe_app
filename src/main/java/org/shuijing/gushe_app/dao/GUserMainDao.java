package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.GUserMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户登陆信息表内含重要信息 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Mapper
public interface GUserMainDao extends BaseMapper<GUserMain> {

}

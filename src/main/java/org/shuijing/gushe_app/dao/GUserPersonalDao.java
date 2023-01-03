package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.GUserPersonal;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表，用作个人页展示 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Mapper
public interface GUserPersonalDao extends BaseMapper<GUserPersonal> {

}

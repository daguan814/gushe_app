package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.BBuyorder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 购买汉服的表，购买后新增一条数据 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface BBuyorderDao extends BaseMapper<BBuyorder> {

}

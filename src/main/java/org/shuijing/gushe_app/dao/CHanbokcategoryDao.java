package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.CHanbokcategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 汉服分类表，包含汉服的所有分类信息 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface CHanbokcategoryDao extends BaseMapper<CHanbokcategory> {

}

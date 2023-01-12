package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.RCollection;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户收藏表，一个是用户id，一个是汉服或者租赁，或者 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface RCollectionDao extends BaseMapper<RCollection> {

}

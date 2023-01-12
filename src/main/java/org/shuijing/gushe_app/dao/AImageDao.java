package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.AImage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 图片表，用来展示所有的图片，汉服以及租赁、摄影师服务都需要用到 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface AImageDao extends BaseMapper<AImage> {

}

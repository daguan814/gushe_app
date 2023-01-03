package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.GUserPublish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 发布前必须要录入的信息 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Mapper
public interface GUserPublishDao extends BaseMapper<GUserPublish> {

}

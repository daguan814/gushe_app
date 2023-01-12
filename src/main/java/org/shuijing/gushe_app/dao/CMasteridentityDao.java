package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.CMasteridentity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 摄影师、设计师等身份表，用来给服务以及什么师分类。 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface CMasteridentityDao extends BaseMapper<CMasteridentity> {

}

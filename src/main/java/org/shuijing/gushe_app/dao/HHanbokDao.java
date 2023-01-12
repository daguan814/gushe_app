package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.HHanbok;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 汉服售卖的基本信息表，也是售卖表 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface HHanbokDao extends BaseMapper<HHanbok> {

}

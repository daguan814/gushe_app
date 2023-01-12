package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.FAddservice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 摄影师新建一个服务，需要审批，通过后才能上架，上架就是把这些需要审批的信息打上pass，然后判断将pass的信息显示到前端app Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface FAddserviceDao extends BaseMapper<FAddservice> {

}

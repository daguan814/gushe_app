package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.RCostrecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户消费记录，包括充值消费，还有订单号。cost为0，充值，为1，消费 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface RCostrecordDao extends BaseMapper<RCostrecord> {

}

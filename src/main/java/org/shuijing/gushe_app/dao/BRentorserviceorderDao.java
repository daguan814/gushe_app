package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.BRentorserviceorder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 租赁或者服务的订单表。用来下单租赁或者服务的。 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface BRentorserviceorderDao extends BaseMapper<BRentorserviceorder> {

}

package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.RCostrecord;
import org.shuijing.gushe_app.dao.RCostrecordDao;
import org.shuijing.gushe_app.service.RCostrecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户消费记录，包括充值消费，还有订单号。cost为0，充值，为1，消费 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class RCostrecordServiceImp extends ServiceImpl<RCostrecordDao, RCostrecord> implements RCostrecordService {

}

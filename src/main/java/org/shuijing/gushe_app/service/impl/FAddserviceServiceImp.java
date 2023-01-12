package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.FAddservice;
import org.shuijing.gushe_app.dao.FAddserviceDao;
import org.shuijing.gushe_app.service.FAddserviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 摄影师新建一个服务，需要审批，通过后才能上架，上架就是把这些需要审批的信息打上pass，然后判断将pass的信息显示到前端app 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class FAddserviceServiceImp extends ServiceImpl<FAddserviceDao, FAddservice> implements FAddserviceService {

}

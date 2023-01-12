package org.shuijing.gushe_app.service;

import org.shuijing.gushe_app.pojo.FAddservice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 摄影师新建一个服务，需要审批，通过后才能上架，上架就是把这些需要审批的信息打上pass，然后判断将pass的信息显示到前端app 服务类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
public interface FAddserviceService extends IService<FAddservice> {

}

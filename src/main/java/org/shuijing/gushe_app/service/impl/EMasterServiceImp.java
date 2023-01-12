package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.EMaster;
import org.shuijing.gushe_app.dao.EMasterDao;
import org.shuijing.gushe_app.service.EMasterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 摄影师、服装师、化妆师信息表，前半部分是管理员添加时必填的，后面是第一次登陆时需要完善的信息，信息需要给管理员或者员工审批 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class EMasterServiceImp extends ServiceImpl<EMasterDao, EMaster> implements EMasterService {

}

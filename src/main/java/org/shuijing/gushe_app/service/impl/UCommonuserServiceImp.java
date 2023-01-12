package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.UCommonuser;
import org.shuijing.gushe_app.dao.UCommonuserDao;
import org.shuijing.gushe_app.service.UCommonuserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 普通用户表,前半部分是注册时传给后台的，后面的是注册后必须补全的 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class UCommonuserServiceImp extends ServiceImpl<UCommonuserDao, UCommonuser> implements UCommonuserService {

}

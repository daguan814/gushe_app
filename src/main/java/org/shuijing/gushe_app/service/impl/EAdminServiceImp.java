package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.EAdmin;
import org.shuijing.gushe_app.dao.EAdminDao;
import org.shuijing.gushe_app.service.EAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员信息表,所有信息必须先设定好，都不能为空 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class EAdminServiceImp extends ServiceImpl<EAdminDao, EAdmin> implements EAdminService {

}

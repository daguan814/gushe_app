package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.AImage;
import org.shuijing.gushe_app.dao.AImageDao;
import org.shuijing.gushe_app.service.AImageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图片表，用来展示所有的图片，汉服以及租赁、摄影师服务都需要用到 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class AImageServiceImp extends ServiceImpl<AImageDao, AImage> implements AImageService {

}

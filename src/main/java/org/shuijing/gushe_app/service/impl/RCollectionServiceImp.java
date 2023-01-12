package org.shuijing.gushe_app.service.impl;

import org.shuijing.gushe_app.pojo.RCollection;
import org.shuijing.gushe_app.dao.RCollectionDao;
import org.shuijing.gushe_app.service.RCollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户收藏表，一个是用户id，一个是汉服或者租赁，或者 服务实现类
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Service
public class RCollectionServiceImp extends ServiceImpl<RCollectionDao, RCollection> implements RCollectionService {

}

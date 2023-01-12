package org.shuijing.gushe_app.dao;

import org.shuijing.gushe_app.pojo.UCommonuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 普通用户表,前半部分是注册时传给后台的，后面的是注册后必须补全的 Mapper 接口
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Mapper
public interface UCommonuserDao extends BaseMapper<UCommonuser> {

}

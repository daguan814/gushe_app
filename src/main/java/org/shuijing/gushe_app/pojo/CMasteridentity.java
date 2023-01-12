package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 摄影师、设计师等身份表，用来给服务以及什么师分类。
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("C_masterIdentity")
public class CMasteridentity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("masterIdentity")
    private String masterIdentity;
}

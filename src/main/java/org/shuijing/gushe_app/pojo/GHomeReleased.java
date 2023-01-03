package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 余额变化后记录的表
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Getter
@Setter
@TableName("g_home_released")
public class GHomeReleased implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("email")
    private String email;

    @TableField("seenstus")
    private Boolean seenstus;
}

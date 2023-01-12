package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户收藏表，一个是用户id，一个是汉服或者租赁，或者
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("R_collection")
public class RCollection implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("email")
    private String email;

    @TableField("otherId")
    private String otherId;
}

package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 图片表，用来展示所有的图片，汉服以及租赁、摄影师服务都需要用到
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("A_image")
public class AImage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("img")
    private String img;
}

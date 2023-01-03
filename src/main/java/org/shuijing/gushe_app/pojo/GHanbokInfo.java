package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 汉服信息表
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Getter
@Setter
@TableName("g_hanbok_info")
public class GHanbokInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @TableField("nametag")
    private String nametag;

    @TableField("category")
    private String category;

    @TableField("style")
    private String style;

    @TableField("price")
    private Double price;

    @TableField("introduction")
    private String introduction;

    @TableField("searchwords")
    private String searchwords;
}

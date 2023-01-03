package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 发布前必须要录入的信息
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Getter
@Setter
@TableName("g_user_publish")
public class GUserPublish implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("email")
    private String email;

    @TableField("maininfo")
    private String maininfo;

    @TableField("image1")
    private String image1;

    @TableField("image2")
    private String image2;

    @TableField("image3")
    private String image3;

    @TableField("phone")
    private String phone;

    @TableField("wx")
    private String wx;

    @TableField("city")
    private String city;

    @TableField("price")
    private Double price;

    @TableField("searchwords")
    private String searchwords;
}

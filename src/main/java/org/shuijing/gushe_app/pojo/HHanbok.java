package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 汉服售卖的基本信息表，也是售卖表
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("H_hanbok")
public class HHanbok implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("hanId")
    private String hanId;

    @TableField("name")
    private String name;

    @TableField("describe")
    private String describe;

    @TableField("price")
    private Double price;

    @TableField("headImg")
    private String headImg;

    @TableField("stock")
    private Integer stock;

    @TableField("startSaleTime")
    private LocalDateTime startSaleTime;

    @TableField("goal")
    private Integer goal;

    @TableField("limitSell")
    private Integer limitSell;

    /**
     * 0：不可购买 1：可以购买，可以租赁 2：可以购买不能租赁
     */
    @TableField("status")
    private Integer status;

    @TableField("search")
    private String search;
}

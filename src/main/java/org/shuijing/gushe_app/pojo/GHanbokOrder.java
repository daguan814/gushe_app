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
 * 汉服商城订单表
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Getter
@Setter
@TableName("g_hanbok_order")
public class GHanbokOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("buyeremail")
    private String buyeremail;

    @TableField("orderid")
    private String orderid;

    @TableField("hanhokid")
    private String hanhokid;

    @TableField("address")
    private String address;

    @TableField("buyerphone")
    private String buyerphone;

    @TableField("buytime")
    private LocalDateTime buytime;

    @TableField("finishtime")
    private LocalDateTime finishtime;

    @TableField("finishstus")
    private Boolean finishstus;
}

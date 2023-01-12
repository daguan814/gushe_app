package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户消费记录，包括充值消费，还有订单号。cost为0，充值，为1，消费
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("R_costRecord")
public class RCostrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("email")
    private String email;

    @TableField("money")
    private Double money;

    @TableField("cost")
    private Boolean cost;

    @TableField("orderId")
    private String orderId;

    @TableField("comment")
    private String comment;
}

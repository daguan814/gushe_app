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
 * 购买汉服的表，购买后新增一条数据
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("B_buyOrder")
public class BBuyorder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("orderId")
    private String orderId;

    /**
     * 汉服的id，用来检索汉服的信息。
     */
    @TableField("hanId")
    private String hanId;

    /**
     * 0:订单取消，1：订单支付成功，2：订单已下单没有支付。
     */
    @TableField("status")
    private Integer status;

    @TableField("orderTime")
    private LocalDateTime orderTime;

    /**
     * 订单金额
     */
    @TableField("money")
    private Double money;

    /**
     * 订单所获的积分
     */
    @TableField("goal")
    private Integer goal;
}

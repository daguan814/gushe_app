package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 租赁或者服务的订单表。用来下单租赁或者服务的。
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("B_rentOrServiceOrder")
public class BRentorserviceorder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("rentId")
    private String rentId;

    @TableField("email")
    private String email;

    @TableField("phone")
    private String phone;

    @TableField("userName")
    private String userName;

    /**
     * 这个id可能是服务的id，也可能是汉服的id，需要做判断。
     */
    @TableField("otherId")
    private String otherId;

    /**
     * 租赁或者服务开始时间
     */
    @TableField("startTime")
    private LocalDate startTime;

    /**
     * 租赁或者服务结束时间
     */
    @TableField("endTime")
    private LocalDateTime endTime;

    @TableField("totalDays")
    private Integer totalDays;

    @TableField("money")
    private Double money;

    /**
     * 订单所获的积分
     */
    @TableField("goal")
    private Integer goal;

    /**
     * 下单时间
     */
    @TableField("orderTime")
    private LocalDateTime orderTime;

    /**
     * 订单状态：0：取消 1：支付成功 2：没有支付
     */
    @TableField("status")
    private Integer status;

    /**
     * 看看是租赁还是服务的订单条。
     */
    @TableField("rentOrService")
    private String rentOrService;
}

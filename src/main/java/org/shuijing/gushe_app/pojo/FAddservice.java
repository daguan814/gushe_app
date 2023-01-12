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
 * 摄影师新建一个服务，需要审批，通过后才能上架，上架就是把这些需要审批的信息打上pass，然后判断将pass的信息显示到前端app
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("F_addService")
public class FAddservice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 提交服务设计师的Id
     */
    @TableId("masterId")
    private String masterId;

    /**
     * 提交审批设计师的名字
     */
    @TableField("masterName")
    private String masterName;

    /**
     * 这里开始就是服务的相关消息了
     */
    @TableField("serviceId")
    private String serviceId;

    @TableField("serviceName")
    private String serviceName;

    @TableField("serviceDescribe")
    private String serviceDescribe;

    @TableField("serviceHeadImg")
    private String serviceHeadImg;

    @TableField("pass")
    private Boolean pass;

    @TableField("suggestion")
    private String suggestion;

    @TableField("dealTime")
    private LocalDateTime dealTime;
}

package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 摄影师、服装师、化妆师信息表，前半部分是管理员添加时必填的，后面是第一次登陆时需要完善的信息，信息需要给管理员或者员工审批
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("E_master")
public class EMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("loginId")
    private String loginId;

    @TableField("pwd")
    private String pwd;

    @TableField("status")
    private Integer status;

    /**
     * 这里的身份需要从masteridentity中选择一个
     */
    @TableField("identity")
    private String identity;

    @TableField("name")
    private String name;

    @TableField("sex")
    private String sex;

    @TableField("age")
    private Integer age;

    @TableField("phone")
    private String phone;

    @TableField("headImg")
    private String headImg;
}

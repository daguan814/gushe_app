package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 普通用户表,前半部分是注册时传给后台的，后面的是注册后必须补全的
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("U_commonUser")
public class UCommonuser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("email")
    private String email;

    @TableField("pwd")
    private String pwd;

    @TableField("regiDate")
    private LocalDate regiDate;

    @TableField("status")
    private Integer status;

    @TableField("vipGoal")
    private Integer vipGoal;

    @TableField("vipGrade")
    private String vipGrade;

    @TableField("money")
    private Double money;

    @TableField("nickName")
    private String nickName;

    @TableField("sex")
    private String sex;

    @TableField("phone")
    private String phone;

    @TableField("headImg")
    private String headImg;

    @TableField("trueName")
    private String trueName;

    @TableField("age")
    private Integer age;
}

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
 * 员工信息表，前半部分是管理员添加员工时必填的，后面是员工第一次登陆时需要完善的信息，信息需要给管理员审批
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("E_employee")
public class EEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("loginId")
    private String loginId;

    @TableField("pwd")
    private String pwd;

    @TableField("firstWorkDate")
    private LocalDate firstWorkDate;

    /**
     * 0：禁用 1：成功 2：待补全和信息审批
     */
    @TableField("status")
    private Integer status;

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

    @TableField("todayWork")
    private Boolean todayWork;

    @TableField("totalWorkDays")
    private Integer totalWorkDays;
}

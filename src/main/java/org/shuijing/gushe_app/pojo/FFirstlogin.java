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
 * 员工第一次登陆信息绑定核查表
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("F_firstLogin")
public class FFirstlogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("loginId")
    private String loginId;

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

    /**
     * 如果通过的话，就更改该员工的status
     */
    @TableField("pass")
    private Boolean pass;

    @TableField("suggestion")
    private String suggestion;

    @TableField("dealTime")
    private LocalDateTime dealTime;
}

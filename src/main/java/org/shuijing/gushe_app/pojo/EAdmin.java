package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 管理员信息表,所有信息必须先设定好，都不能为空
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("E_admin")
public class EAdmin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("loginId")
    private String loginId;

    @TableField("pwd")
    private String pwd;

    @TableField("name")
    private String name;

    @TableField("headImg")
    private String headImg;

    @TableField("phone")
    private String phone;
}

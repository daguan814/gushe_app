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
 * 用户登陆信息表内含重要信息
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Getter
@Setter
@TableName("g_user_main")
public class GUserMain implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("email")
    private String email;

    @TableField("pwd")
    private String pwd;

    @TableField("viptime")
    private LocalDate viptime;

    @TableField("todayvipgeted")
    private Integer todayvipgeted;

    @TableField("money")
    private Double money;
}

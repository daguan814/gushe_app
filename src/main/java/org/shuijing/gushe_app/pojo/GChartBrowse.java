package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户浏览记录表
 * </p>
 *
 * @author shuijing
 * @since 2023-01-03
 */
@Getter
@Setter
@TableName("g_chart_browse")
public class GChartBrowse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("email_use")
    private String emailUse;

    @TableField("email_by")
    private String emailBy;
}
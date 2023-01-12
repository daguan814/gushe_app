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
 * 
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("R_empWorkDays")
public class REmpworkdays implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("empId")
    private String empId;

    @TableField("dateTime")
    private LocalDateTime dateTime;
}

package org.shuijing.gushe_app.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 汉服分类表，包含汉服的所有分类信息
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@Getter
@Setter
@TableName("C_hanbokCategory")
public class CHanbokcategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("hanId")
    private String hanId;

    @TableField("hanbokCategory")
    private String hanbokCategory;
}

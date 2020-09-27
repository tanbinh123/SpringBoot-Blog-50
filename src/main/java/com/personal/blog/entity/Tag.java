package com.personal.blog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 标签实体类
 * @author YUDI
 * @date 2020/9/21 23:55
 */
@Data
public class Tag {

    private Long id;
    /** 分类名称 */
    private String name;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /** 更新时间 */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}

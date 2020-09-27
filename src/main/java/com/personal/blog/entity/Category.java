package com.personal.blog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 文章分类实体类
 * @author YUDI
 * @date 2020/9/21 23:54
 */
@Data
public class Category {

    private Long id;
    /** 分类名称 */
    private String name;
    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.UPDATE)
    /** 更新时间 */
    private LocalDateTime updateTime;

}

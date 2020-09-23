package com.personal.blog.entity;

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
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;


}

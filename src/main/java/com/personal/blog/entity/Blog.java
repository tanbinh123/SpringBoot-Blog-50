package com.personal.blog.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 博客实体类
 * @author YUDI
 * @date 2020/9/21 23:41
 */
@Data
public class Blog {

    private Long id;
    /** 分类ID */
    private Long categoryId;
    /** 标签ID */
    private String tagIds;
    /** 标题 */
    private String title;
    /** 内容 */
    private String content;
    /** 首图 */
    private String firstPicture;
    /** 标记 */
    private String flag;
    /** 浏览次数 */
    private Integer views;
    /** 打赏状态 */
    private boolean appreciation;
    /** 版权状态 */
    private boolean shareStatement;
    /** 评论状态 */
    private boolean commentAble;
    /** 发布 */
    private boolean published;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;
    /** 类别 */
    private Category category;
    /** 标签 */
    private List<Tag> tags;
}



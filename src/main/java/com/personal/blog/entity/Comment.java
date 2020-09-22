package com.personal.blog.entity;

import java.time.LocalDateTime;

/**
 * 评论实体类
 * @author YUDI
 * @date 2020/9/21 23:56
 */
public class Comment {

    private Long id;
    /** 父评论ID */
    private Long parentId;
    /** 评论人名称 */
    private String nickName;
    /** 邮箱 */
    private String email;
    /** 内容 */
    private String content;
    /** 头像 */
    private String avatar;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;

}




package com.personal.blog.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

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
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /** 更新时间 */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

}




package com.personal.blog.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户实体类
 * @author YUDI
 * @date 2020/9/21 23:58
 */
@Data
public class User {

    private Long id;
    /** 名称 */
    private String nickname;
    /** 账号 */
    private String username;
    /** 密码 */
    private String password;
    /** 邮箱 */
    private String email;
    /** 头像 */
    private String avatar;
    /** 用户类型 */
    private Integer type;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;
}




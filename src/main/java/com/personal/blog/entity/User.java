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
    private String username;
    /** 用户类型 */
    private Integer userType;
    /** 账号 */
    private String loginName;
    /** 密码 */
    private String password;
    /** 性别 */
    private String sex;
    /** 邮箱 */
    private String email;
    /** 头像 */
    private String avatar;
    /** 创建时间 */
    private LocalDateTime createTime;
    /** 更新时间 */
    private LocalDateTime updateTime;
}




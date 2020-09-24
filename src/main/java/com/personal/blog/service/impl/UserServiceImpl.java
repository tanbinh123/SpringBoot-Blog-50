package com.personal.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personal.blog.entity.User;
import com.personal.blog.mapper.UserMapper;
import com.personal.blog.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户ServiceImpl
 * @author YUDI
 * @date 2020/9/23 0:00
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

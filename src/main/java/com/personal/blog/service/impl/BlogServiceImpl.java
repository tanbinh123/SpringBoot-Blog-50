package com.personal.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personal.blog.entity.Blog;
import com.personal.blog.mapper.BlogMapper;
import com.personal.blog.service.BlogService;
import org.springframework.stereotype.Service;

/**
 * 博客ServiceImpl
 * @author YUDI
 * @date 2020/9/23 0:03
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
}

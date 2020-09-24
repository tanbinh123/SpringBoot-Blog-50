package com.personal.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personal.blog.entity.Category;
import com.personal.blog.mapper.CategoryMapper;
import com.personal.blog.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * 博客分类ServiceImpl
 * @author YUDI
 * @date 2020/9/23 0:03
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}

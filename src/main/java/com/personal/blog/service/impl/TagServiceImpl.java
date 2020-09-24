package com.personal.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personal.blog.entity.Tag;
import com.personal.blog.mapper.TagMapper;
import com.personal.blog.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 博客标签ServiceImpl
 * @author YUDI
 * @date 2020/9/23 0:04
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
}

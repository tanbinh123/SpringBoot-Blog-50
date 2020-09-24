package com.personal.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.personal.blog.entity.Comment;
import com.personal.blog.mapper.CommentMapper;
import com.personal.blog.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * 评论ServiceImpl
 * @author YUDI
 * @date 2020/9/23 0:04
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper,Comment> implements CommentService {
}

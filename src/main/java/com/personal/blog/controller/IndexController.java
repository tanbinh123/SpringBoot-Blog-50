package com.personal.blog.controller;

import com.personal.blog.exception.NotFoundException;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 首页Controller
 * @author YUDI
 * @date 2020/9/21 22:25
 */
@Controller
public class IndexController {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable String id, @PathVariable String name){
        return "index";
    }

}

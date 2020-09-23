package com.personal.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页Controller
 * @author YUDI
 * @date 2020/9/21 22:25
 */
@Controller
public class IndexController {

    @GetMapping("")
    public String index(){
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/category")
    public String category(){
        return "category";
    }

    @GetMapping("/tags")
    public String tags(){
        return "tags";
    }

    @GetMapping("/archives")
    public String archives(){
        return "archives";
    }
}

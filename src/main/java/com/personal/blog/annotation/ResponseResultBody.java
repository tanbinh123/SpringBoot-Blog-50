package com.personal.blog.annotation;

import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * 注解类，继承 @ResponseBody
 * @author YUDI
 * @date 2020/9/24 20:54
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@ResponseBody
public @interface ResponseResultBody {

}

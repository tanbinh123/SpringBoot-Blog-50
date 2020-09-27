package com.personal.blog.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis-Plus 配置类
 * @author YUDI
 * @date 2020/9/27 21:27
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * Mybatis-Plus 分页插件配置
     * @return
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        paginationInnerInterceptor.setMaxLimit(5L);
        return paginationInnerInterceptor;
    }

}

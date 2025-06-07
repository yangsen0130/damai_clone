package com.damai.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @program: damai
 * @description: 过滤器配置
 * @author: yangsen
 **/
public class FilterConfig {

    @Bean
    public OncePerRequestFilter requestParamContextFilter(){
        return new RequestParamContextFilter();
    }
}

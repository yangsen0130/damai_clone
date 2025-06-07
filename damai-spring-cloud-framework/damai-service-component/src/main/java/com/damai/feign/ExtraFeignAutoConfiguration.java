package com.damai.feign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import static com.damai.constant.Constant.SERVER_GRAY;


/**
 * @program: damai
 * @description: feign扩展插件配置类
 * @author: yangsen
 **/

public class ExtraFeignAutoConfiguration {
    
    @Value(SERVER_GRAY)
    public String serverGray;
    
    @Bean
    public FeignRequestInterceptor feignRequestInterceptor(){
        return new FeignRequestInterceptor(serverGray);
    }
}

package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lwc
 * @date 2020/10/12 11:28
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//只有@loadBalance注解修饰的restTemplate才能实现服务名的调用，没有修饰的restTemplate是没有该功能的。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

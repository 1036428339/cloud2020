package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lwc
 * @date 2020/10/12 17:55
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7003 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7003.class,args);
    }
}

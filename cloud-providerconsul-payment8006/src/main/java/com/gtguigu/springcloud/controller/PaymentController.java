package com.gtguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author lwc
 * @date 2020/10/14 10:13
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private  String servsrPort;

    @RequestMapping(value = "/payment/consul")
    public String payment(){
        return "springcloud with consul: " + servsrPort + "\t" + UUID.randomUUID().toString();
    }
}

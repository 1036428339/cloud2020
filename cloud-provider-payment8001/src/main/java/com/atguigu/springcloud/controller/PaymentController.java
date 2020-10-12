package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.sound.sampled.Line;

/**
 * @author liwenchang
 * @create 2020-09-27 23:05
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.info("payment"+payment);
        int result = paymentService.create(payment);
        log.info("****插入结果"+result);
        if(result >0 ){
            return new CommonResult(200,"操作成功",result);
        }else {
            return new CommonResult(444,"操作失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("****查找结果"+result);
        if(result != null ){
            return new CommonResult(200,"操作成功",result);
        }else {
            return new CommonResult(444,"操作失败"+id);
        }
    }
}

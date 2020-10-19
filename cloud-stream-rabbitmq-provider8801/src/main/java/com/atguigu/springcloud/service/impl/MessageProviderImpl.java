package com.atguigu.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.atguigu.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @author lwc
 * @date 2020/10/19 11:50
 */
@EnableBinding(Source.class)//定义消息的推送管道
@Slf4j
public class MessageProviderImpl implements IMessageProvider{
    @Resource
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {
        String strial = IdUtil.simpleUUID();
        output.send(MessageBuilder.withPayload(strial).build());
        log.info("****strial:" + strial);
        return null;
    }
}

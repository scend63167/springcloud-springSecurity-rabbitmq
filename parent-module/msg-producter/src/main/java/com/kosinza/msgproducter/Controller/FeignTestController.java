package com.kosinza.msgproducter.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/product")
@Slf4j
public class FeignTestController {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/msg")
    public void sendMsg() {
        for (int i =1 ;i<=1000;i++ ) {
            amqpTemplate.convertAndSend("myQueue", i+"===========> now :" + new Date());
            log.info("发送的是第：{}个消息",i);
        }
    }
}

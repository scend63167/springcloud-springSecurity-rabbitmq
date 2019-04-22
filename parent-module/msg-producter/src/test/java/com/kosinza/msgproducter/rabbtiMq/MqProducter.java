package com.kosinza.msgproducter.rabbtiMq;


import com.kosinza.msgproducter.MsgProducterApplicationTests;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MqProducter extends MsgProducterApplicationTests {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue","now :"+new Date());
    }
}

package com.kosinza.msgcustomer.Controller;

import com.kosinza.msgcustomer.client.ProducterClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ProducterClient producterClient;

    @GetMapping("/send")
    public void send(){
        producterClient.productMsg();
    }

    @RabbitListener(queues = "myQueue")
    public void receive(String msg){
        log.info("MqReceiver:{}",msg);
    }
}

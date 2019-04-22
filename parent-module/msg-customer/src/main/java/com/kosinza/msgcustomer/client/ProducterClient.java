package com.kosinza.msgcustomer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "msg-producter")
public interface ProducterClient {
    @GetMapping("/product/msg")
    void productMsg();
}

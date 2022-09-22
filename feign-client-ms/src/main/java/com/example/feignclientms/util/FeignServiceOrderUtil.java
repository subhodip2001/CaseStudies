package com.example.feignclientms.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "order-service", url = "http://localhost:3003/order")
public interface FeignServiceOrderUtil {

    @GetMapping("/order")
    String getOrderId();
}

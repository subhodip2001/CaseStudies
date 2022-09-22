package com.example.feignclientms.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "customer-service", url = "http://localhost:3002/customer/find/")
public interface FeignServiceCustomerUtil {

    @GetMapping("/customer")
    String getCustomer_id();
}

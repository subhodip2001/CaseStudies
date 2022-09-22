package com.example.feignclientms.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product-service", url = "http://localhost:3001/product")
public interface FeignServiceProductUtil {

    @GetMapping("/product")
    String getProduct_id();
}

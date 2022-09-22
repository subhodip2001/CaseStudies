package com.example.feignclientms.controller;

import com.example.feignclientms.util.FeignServiceCustomerUtil;
import com.example.feignclientms.util.FeignServiceOrderUtil;
import com.example.feignclientms.util.FeignServiceProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignServiceOrderUtil feignServiceOrderUtil;
    @GetMapping("/order")
    public String getOrderId(){
        return feignServiceOrderUtil.getOrderId();
    }


    @Autowired
    private FeignServiceProductUtil feignServiceProductUtil;
    @GetMapping("/product")
    public String getProduct_id(){
        return feignServiceProductUtil.getProduct_id();
    }


    @Autowired
    private FeignServiceCustomerUtil feignServiceCustomerUtil;

    @GetMapping("/customer")
    public String getCustomer_id(){
        return feignServiceCustomerUtil.getCustomer_id();
    }


}

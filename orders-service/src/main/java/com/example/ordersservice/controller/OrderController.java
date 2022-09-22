package com.example.ordersservice.controller;

import com.example.ordersservice.TP.ResponseTemplateTP;
import com.example.ordersservice.model.Order;
import com.example.ordersservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/make")
    public Order makeOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
    @GetMapping("/find/{id}")
    public ResponseTemplateTP getOrderWithCustomer(@PathVariable("id") Long customer_id){
        return orderService.getOrderWithCustomer(customer_id);
    }
    @PutMapping("/update/{id}")
    public Order updateOrder(@PathVariable("id") Long orderId,@RequestBody Order order){
        return orderService.updateOrder(orderId,order);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable("id") Long orderId){
        orderService.deleteOrder(orderId);
    }
}

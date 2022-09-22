package com.example.ordersservice.TP;

import com.example.ordersservice.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateTP {

    private Order order;
    private Customer customer;
    private Product product;

}

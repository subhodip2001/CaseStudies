package com.example.ordersservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    private Long orderId;
    private Long order_number;
    private String order_status;
    private Long product_id;
    private Long customer_id;
}

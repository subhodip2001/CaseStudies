package com.example.ordersservice.TP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private Long product_id;
    private String product_name;
    private Long product_cost;
    private Long product_qty;
}

package com.example.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
//@Document(collection = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private Long product_id;
    private String product_name;
    private Long product_cost;
    private Long product_qty;
}

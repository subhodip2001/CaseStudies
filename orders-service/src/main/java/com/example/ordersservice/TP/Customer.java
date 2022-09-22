package com.example.ordersservice.TP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Customer {
        @Id
        private Long customer_id;
        private String customer_name,customer_email,customer_phone,customer_city
                ,customer_state,customer_country;

    }

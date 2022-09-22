package com.example.ordersservice.repository;

import com.example.ordersservice.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository <Order,Long> {

    Order findByOrderId(Long orderId);
}

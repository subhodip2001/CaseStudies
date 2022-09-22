package com.example.customerservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.customerservice.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Long> {
}

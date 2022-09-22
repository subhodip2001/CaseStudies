package com.example.customerservice.controller;

import com.example.customerservice.model.Customer;
import com.example.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);

    }
    @GetMapping("/find/{id}")
    public Optional<Customer> findByID(@PathVariable("id") Long id){
        return customerService.findByID(id);

    }
    @PutMapping("/update/{id}")
    public Customer updateCustomer(@PathVariable("id") Long customer_id,@RequestBody Customer customer){
        return customerService.updateCustomer(customer_id,customer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable("id") Long customer_id){
        customerService.deleteCustomer(customer_id);
    }
}

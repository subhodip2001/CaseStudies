package com.example.customerservice.service;

import com.example.customerservice.model.Customer;
import com.example.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer c){
        return customerRepository.save(c);
    }
    public Optional<Customer> findByID(Long customer_id){
        return customerRepository.findById(customer_id);

    }
    public Customer updateCustomer(Long customer_id, Customer customer){
        Optional<Customer> CustomerData=customerRepository.findById(customer_id);
        Customer _customer=CustomerData.get();
        _customer.setCustomer_id(customer.getCustomer_id());
        _customer.setCustomer_name(customer.getCustomer_name());
        _customer.setCustomer_email(customer.getCustomer_email());
        _customer.setCustomer_phone(customer.getCustomer_phone());
        _customer.setCustomer_city(customer.getCustomer_city());
        _customer.setCustomer_state(customer.getCustomer_state());
        _customer.setCustomer_country(customer.getCustomer_country());

        return customerRepository.save(_customer);
    }
    public void deleteCustomer(Long customer_id){
            customerRepository.deleteById(customer_id);
    }
}

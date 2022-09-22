package com.example.ordersservice.service;

import com.example.ordersservice.TP.Customer;
import com.example.ordersservice.TP.Product;
import com.example.ordersservice.TP.ResponseTemplateTP;
import com.example.ordersservice.model.Order;
import com.example.ordersservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;
    
    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public ResponseTemplateTP getOrderWithCustomer(Long orderId){
        ResponseTemplateTP responseTemplateTP=new ResponseTemplateTP();
        Order order=orderRepository.findByOrderId(orderId);
        Customer customer=restTemplate.getForObject("http://CUSTOMER-SERVICE/customer/find/"+order.getCustomer_id(),Customer.class);
        Product product=restTemplate.getForObject("http://PRODUCT-SERVICE/product/find/"+order.getProduct_id(), Product.class);
        responseTemplateTP.setOrder(order);
        responseTemplateTP.setCustomer(customer);
        responseTemplateTP.setProduct(product);
        return responseTemplateTP;

    }

    public Order updateOrder(Long orderId,Order order){
        Optional<Order> OrderData=orderRepository.findById(orderId);
        Order _order=OrderData.get();
        _order.setOrderId(order.getOrderId());
        _order.setOrder_number(order.getOrder_number());
        _order.setOrder_status(order.getOrder_status());
        _order.setProduct_id(order.getProduct_id());
        _order.setCustomer_id(order.getCustomer_id());
        return orderRepository.save(_order);
    }
    public void deleteOrder(Long orderId){
        orderRepository.deleteById(orderId);
    }


}

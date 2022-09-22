package com.example.productservice.controller;


import com.example.productservice.model.Product;
import com.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/find/{id}")
    public Optional<Product> findById(@PathVariable("id") Long id){
        return productService.findById(id);
    }
    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable("id") Long product_id,@RequestBody Product product){
        return productService.updateProduct(product_id,product);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") Long product_id){
        productService.deleteProduct(product_id);
    }


}

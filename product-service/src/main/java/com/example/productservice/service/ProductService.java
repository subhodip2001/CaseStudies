package com.example.productservice.service;
import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public Product createProduct(Product product){
       return productRepository.save(product);

    }

    public Optional<Product> findById(Long product_id){
        return productRepository.findById(product_id);
    }
    public Product updateProduct(Long product_id,Product product){
        Optional<Product> ProductData=productRepository.findById(product_id);
        Product _product=ProductData.get();
        _product.setProduct_id(product.getProduct_id());
        _product.setProduct_name(product.getProduct_name());
        _product.setProduct_cost(product.getProduct_cost());
        _product.setProduct_qty(product.getProduct_qty());
        _product.setProduct_cost(product.getProduct_cost());
        return productRepository.save(_product);
    }
    public void deleteProduct(Long product_id){
        productRepository.deleteById(product_id);
    }

}

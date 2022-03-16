package com.example.lab4.service;

import com.example.lab4.model.Product;
import com.example.lab4.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ProductService(ProductRepository productRepository) {

    public void addProduct(Product product){
        productRepository.addProduct(product);
    }

    public List<Product> getProducts(){
        return productRepository.getProducts();
    }

}

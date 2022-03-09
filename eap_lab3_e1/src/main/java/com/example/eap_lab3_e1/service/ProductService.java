package com.example.eap_lab3_e1.service;

import com.example.eap_lab3_e1.model.Product;
import com.example.eap_lab3_e1.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/// Service are nevoie de Repository !!!!
@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.addProduct(product);
    }
}

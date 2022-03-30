package com.example.eap_lab6_1.controller;

import com.example.eap_lab6_1.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    
    @GetMapping("/products")
    public List<Product> getProducts(){
        return List.of(
                new Product("Product 1", new BigDecimal(1)),
                new Product("Product 2", new BigDecimal(2)),
                new Product("Product 3", new BigDecimal(3))
        );
    }
}

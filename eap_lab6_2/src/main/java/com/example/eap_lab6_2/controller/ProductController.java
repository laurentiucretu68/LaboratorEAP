package com.example.eap_lab6_2.controller;

import com.example.eap_lab6_2.model.Product;
import com.example.eap_lab6_2.proxy.ProductProxy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductProxy productProxy;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productProxy.getProducts();
    }
}

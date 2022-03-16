package com.example.lab4.controller;

import com.example.lab4.model.Product;
import com.example.lab4.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}

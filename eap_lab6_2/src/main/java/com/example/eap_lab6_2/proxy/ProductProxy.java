package com.example.eap_lab6_2.proxy;

import com.example.eap_lab6_2.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="products", url = "http://localhost:8080")
public interface ProductProxy {

    @GetMapping("/api/products")
    List<Product> getProducts();
}

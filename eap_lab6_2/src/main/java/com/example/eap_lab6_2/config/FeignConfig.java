package com.example.eap_lab6_2.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.eap_lab6_2.proxy")
public class FeignConfig {

}

package com.example.ProductApp.App.Config;

import com.example.ProductApp.App.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {
    @Bean
    Product product(){
        return new Product();
    }
}

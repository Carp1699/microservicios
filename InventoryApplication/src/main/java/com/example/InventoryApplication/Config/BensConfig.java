package com.example.InventoryApplication.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class BensConfig {

    @Bean
    public Random random(){
        return new Random();
    }
}

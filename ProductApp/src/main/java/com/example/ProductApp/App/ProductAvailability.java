package com.example.ProductApp.App;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory-service")
public interface ProductAvailability {
    @GetMapping(path = "inventory")
    int Available (@RequestParam(name = "uniqId") String uniqId);
}

package com.example.ProductApp.App;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("catalog-service")
public interface ProductCatalog {
    @GetMapping("/product/id")
    Product getProductByUniq_ID(@RequestParam(name = "uniq_id") String uniq_id);
    @GetMapping("/product/sku")
    List<Product> getProductBySku(@RequestParam(name = "sku") String sku);
}

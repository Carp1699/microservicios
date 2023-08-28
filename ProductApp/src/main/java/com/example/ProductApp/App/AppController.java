package com.example.ProductApp.App;

import com.example.ProductApp.App.Exceptions.Exceptions.NotInventoryException;
import com.example.ProductApp.App.Exceptions.Exceptions.ProductNotFoundException;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "app")
public class AppController {
    @Autowired
    AppService appService;
    @Autowired
    Product product;
    @GetMapping(path = "/id")
    public FinalProduct Producto(@RequestParam(name = "uniq_id") String uniqId){
        try{
           product = appService.getProductById(uniqId);
        }
     catch (FeignException.NotFound exception){
         System.out.println(exception.status());
         throw exception;
     }
     int quantity = appService.getAvailabilityById(product.getUniq_id());
     if (quantity < 1) throw new NotInventoryException("Not inventory of this product");
     return new FinalProduct(product,quantity);
    }
    @GetMapping(path = "/sku")
    public List<Product> productList(@RequestParam(name = "sku") String sku){
        List<Product> productList = new ArrayList<>();
        productList = appService.getProductBySku(sku);
        if (productList.size()>0){
           productList = productList.stream()
                    .filter(product -> appService.getAvailabilityById(product.getUniq_id())> 0)
                    .toList();
        }
        return productList;
    }

}

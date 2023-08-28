package com.example.ProductApp.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    private final ProductCatalog productCatalogClient;
    private final ProductAvailability productAvailability;
    @Autowired
    public AppService(ProductCatalog productCatalogClient, ProductAvailability productAvailability) {
        this.productCatalogClient = productCatalogClient;
        this.productAvailability = productAvailability;
    }

    public int getAvailabilityById(String uniqId){
        return productAvailability.Available(uniqId);
    }
    public Product getProductById(String uniqId){
        return productCatalogClient.getProductByUniq_ID(uniqId);
    }
    public List<Product> getProductBySku(String sku){
        return productCatalogClient.getProductBySku(sku);
    }
}

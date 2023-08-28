package com.example.ProductApp.App;

import lombok.Data;

@Data
public class FinalProduct {
    private Product product;
    private int quantity;

    public FinalProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}

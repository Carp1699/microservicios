package com.example.ProductApp.App.Exceptions.Exceptions;


public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}

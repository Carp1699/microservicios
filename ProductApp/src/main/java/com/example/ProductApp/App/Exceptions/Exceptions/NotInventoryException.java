package com.example.ProductApp.App.Exceptions.Exceptions;

public class NotInventoryException extends RuntimeException{
    public NotInventoryException(String message) {
        super(message);
    }
}

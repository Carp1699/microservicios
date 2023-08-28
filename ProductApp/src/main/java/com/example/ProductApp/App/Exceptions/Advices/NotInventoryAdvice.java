package com.example.ProductApp.App.Exceptions.Advices;

import com.example.ProductApp.App.Exceptions.Exceptions.NotInventoryException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotInventoryAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NotInventoryException.class)
    public String productNotFound( final NotInventoryException notInventoryException) {
        return notInventoryException.getMessage();
    }
}

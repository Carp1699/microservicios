package com.example.InventoryApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(path = "inventory")
public class Controller {
    @Autowired
    private Random random;
    @GetMapping
    public int Available (@RequestParam(name = "uniqId") String uniqId){
        return random.nextInt(11);
    }
}

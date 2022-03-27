package com.example.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @PostMapping("/products")
    public boolean createNewProduct(){
        // TODO: 27/03/2022 code that will save a new product in database!
        System.out.println("new Product created!");
        return false;
    }

}

/*
// HTTP REQUEST:
url:            http://localhost:8080
endpoint:       /products
method:         POST
headers:
body:



 */
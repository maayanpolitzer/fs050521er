package com.company;

public class Product {

    // static variables
    static int counter;

    // fields (data in each object)
    String name;
    double price;

    // constructors:
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        counter++;
    }

    // methods:


}

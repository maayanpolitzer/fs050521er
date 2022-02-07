package com.company;

public abstract class Oil extends Product {

    private String name;

    public Oil(int amount, String name, float pricePerKilo){
        super(amount, pricePerKilo);
        this.name = name;
    }



}

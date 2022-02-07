package com.company;

public abstract class Product {

    private int amount;
    private float pricePerKilo;

    public Product(int amount, float pricePerKilo){
        this.amount = amount;
        this.pricePerKilo = pricePerKilo;
    }

    public float getTotalProductPrice(){
        return amount * pricePerKilo;
    }

}

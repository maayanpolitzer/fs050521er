package com.company;

public class Cart {

    String customerName;
    Product[] productList;

    public Cart(String customerName, Product[] productList){
        this.customerName = customerName;
        this.productList = productList;
    }

    public double getTotalPrice(){
        double sum = 0;
        for(Product p: productList){
            sum += p.price;
        }
        return sum;
    }

}

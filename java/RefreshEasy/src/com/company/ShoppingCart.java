package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;

    public ShoppingCart(){
        products = new ArrayList<Product>();
    }

    public void addProductToCart(Product product){
        products.add(product);
    }

    public void removeProductFromCart(Product product){
        this.products.remove(product);
    }

    public void removeProductFromCart(int index){
        this.products.remove(index);
    }

    public float getSum(){
        float sum = 0;
        for(Product product : products){
            sum += product.getTotalProductPrice();
        }
        return sum;
    }

}

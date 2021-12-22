package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Product[] list = {
                new Product("lego", 309.90),
                new Product("Agabe", 14.90),
                new Product("Agabe", 14.90)
        };
        */

        System.out.println(Product.counter);
        Product p1 = new Product("lego", 309.90);
        Product p2 = new Product("Agabe", 14.90);
        Product p3 = new Product("Agabe", 14.90);
        System.out.println(Product.counter);

        Product[] list = {p1, p2, p3};

        Cart customerCart = new Cart("Maayan Politzer", list);

        System.out.println("total price for " + customerCart.customerName);
        System.out.println(customerCart.getTotalPrice());
    }
}

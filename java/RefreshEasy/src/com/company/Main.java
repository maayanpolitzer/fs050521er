package com.company;

public class Main {

    public static void main(String[] args) {

        ShoppingCart maayanCart = new ShoppingCart();

        Product p1 = new OliveOil(3);
        Product p2 = new CornOil(1);

        maayanCart.addProductToCart(p1);
        maayanCart.addProductToCart(p2);

        maayanCart.removeProductFromCart(1);
        maayanCart.removeProductFromCart(p1);

        System.out.println(maayanCart.getSum());

        maayanCart.pay(new CreditCard("53261023..........",1, "07/23", 145, "032700196"));

        maayanCart.sendInvoiceToMail("maayanp163@gmail.com");

    }
}

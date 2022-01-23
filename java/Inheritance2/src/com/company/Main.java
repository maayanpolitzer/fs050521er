package com.company;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car();
        //c1.printCarType();

        Mazda c2 = new Mazda();
        //c2.printCarType();

        Fiat c3 = new Fiat();
        //c3.printCarType();

        Object c4 = new Mazda();

        Car[] arr = new Car[]{c1,c2,c3, c4};

        Car temp = arr[1];
        temp.printCarType();
        if(temp instanceof Mazda) {
            Mazda t2 = (Mazda) temp;
            t2.m();
        }

    }
}

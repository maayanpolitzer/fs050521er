package com.company;

public class Yaris extends Toyota{

    public Yaris(String color) {
        super(color);
    }

    @Override
    public void printToyotaModel() {
        System.out.println("Toyota yaris");
    }

    @Override
    public void printMaxSpeed() {
        System.out.println(150);
    }
}

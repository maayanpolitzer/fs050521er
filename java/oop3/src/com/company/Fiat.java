package com.company;

public class Fiat extends Vehicle{

    public Fiat(String color){
        super(color);
    }

    @Override
    public void printMaxSpeed() {
        System.out.println(170);
    }
}


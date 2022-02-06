package com.company;

public class BMW extends Vehicle{

    public BMW(String color){
        super(color);
    }

    @Override
    public void printMaxSpeed() {
        System.out.println(250);
    }

}

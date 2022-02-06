package com.company;

public class Porche extends Vehicle{

    public Porche(){
        super("Black");
    }

    @Override
    public void printMaxSpeed() {
        System.out.println(290);
    }
}

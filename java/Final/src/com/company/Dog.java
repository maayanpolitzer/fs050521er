package com.company;

public class Dog {

    private static int counter = 1;

    private final int ID;
    private String name;

    public Dog(String name){
        ID = counter++;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

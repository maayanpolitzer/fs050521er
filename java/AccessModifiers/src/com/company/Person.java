package com.company;

public class Person {

    static int counter;

    String name;
    String phone;

    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
        counter++;
    }

}

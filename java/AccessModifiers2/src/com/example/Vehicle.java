package com.example;

public class Vehicle {

    private String color;

    public Vehicle(String color){
        this.color = color;
    }

    public String getDetails(){
        return "Vehicle with color: " + color;
    }

    public String getColor(){
        return color;
    }

}

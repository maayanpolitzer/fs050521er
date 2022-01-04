package com.company;

import com.example.Vehicle;

public class User {

    private static int counter;

    private int id;
    private String name;
    private String email;
    private String password;
    private Vehicle vehicle;
    private boolean vegan;

    public User(String name,
                String email,
                String password,
                Vehicle vehicle){
        this.id = ++counter;
        this.name = name;
        this.email = email;
        this.password = password;
        this.vehicle = vehicle;
    }

    int getId(){
        return id;
    }

    Vehicle getVehicle(){
        return vehicle;
    }

    void setPassword(String password){
        if(password.length() >= 6) {
            this.password = password;
        }else{
            System.out.println("This password is too short...");
        }
    }

    void setEmail(String email){
        this.email = email;
    }

    String getName(){
        return name;
    }

    // boolean will be isVegan() and not getVegan();
    boolean isVegan(){
        return vegan;
    }

    String getDetails(){
        return "user id: " + id +
                ", name: " + name +
                ", email: " + email +
                ", password: " + password +
                ", vehicle: " + vehicle.getDetails();
    }

}

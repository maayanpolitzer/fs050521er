package com.company;

public class Vehicle {

    static int counter;

    String licensePlate;
    String color;
    Person[] owners;

    public Vehicle(String licensePlate, String color, Person originalOwner){
        this.licensePlate = licensePlate;
        this.color = color;
        owners = new Person[10];
        owners[0] = originalOwner;
        counter++;
    }

    // can be done with another field (like: int hand)
    public void printCurrentOwnerPhone(){
        for(int i = 0; i < owners.length; i++){
            if(owners[i] == null){
                System.out.println(owners[i-1].phone);
                break;
            }
        }
    }

    // can be done with another field (like: int hand)
    public void changeOwner(Person newOwner){
        for(int i = 0; i < owners.length; i++){
            if(owners[i] == null){
                owners[i] = newOwner;
                break;
            }
        }
    }

    // non-static data can use static data.
    public void x(){
        System.out.println("from NOT static method x(): " + counter);
        y();
    }

    // static data CANNOT use non-static data
    public static void y(){
        System.out.println("from static method y(): " + counter);
    }

}

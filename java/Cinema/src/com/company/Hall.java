package com.company;

public class Hall {

    boolean[] seats = new boolean[20];  // [false, false, ....];

    public void orderOneTicket(){
        for(int i = 0; i < seats.length; i++) {
            if (seats[i] == false) {
                seats[i] = true;
                System.out.println("your seat number is " + i);
                break;
            }
        }
    }

    public void orderGroup(int amount){

    }


}

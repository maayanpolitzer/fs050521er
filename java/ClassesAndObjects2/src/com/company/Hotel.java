package com.company;

public class Hotel {

    int rooms;  // default is 0;
    String name;
    int floors;

    // default constructor: (without parameters)
    public Hotel(){
        this(10);
    }

    public Hotel(int rooms){

        /*
        this.rooms = rooms;
        this.name = "Default name hotel";
        */

        // שרשור בנאים/ concatenating constructors
        // using the main constructor
        this(rooms, "Default name hotel", 1);
    }

    // main constructor
    // constructor/בנאי: method that is called when the object is created.
    public Hotel(int rooms, String name, int floors){
        this.rooms = rooms;
        this.name = name;
        this.floors = floors;
    }

    public void setRooms(int rooms){
        this.rooms = rooms;
    }

    public void printHotelDetails(){
        System.out.println("Hotel name: " + this.name);
        System.out.println("number of rooms: " + rooms);
    }

    /*
    public void setRooms(int numberOfRooms){
        rooms = numberOfRooms;
    }
    */
}

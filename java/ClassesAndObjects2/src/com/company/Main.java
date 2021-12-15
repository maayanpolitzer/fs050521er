package com.company;

public class Main {

    //   object oriented - יש אובייקטים וההתנהלות שלהם אחד עם השני יקל על כתיבת/הבנת התוכנה

    public static void main(String[] args) {
        Hotel myHotel = new Hotel(10, "Maayan's Hotel", 4);    // create object from Hotel class
        Hotel rotemHotel = new Hotel(50, "Rotem's hotel", 2);


        Hotel w = new Hotel();
        Hotel c = new Hotel(11);

        myHotel.setRooms(12);
        rotemHotel.setRooms(130);

        myHotel.printHotelDetails();
        System.out.println("------");
        rotemHotel.printHotelDetails();
    }
}

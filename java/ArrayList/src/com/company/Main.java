package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        primitive variables types (NOT a class or an object):
        boolean
        byte
        short
        int
        long
        float
        double
        char
        */

        // pure object oriented - שפה שכל דבר שנכתוב הוא אובייקט
        // java is almost pure object oriented (because it has 8 primitive types).

        //boolean[] arr = new boolean[]{true, false, false};
        //Dog[] dogs = new Dog[]{new Dog("Humi")};

        // <> diamond operator / generic.
        // בתוך הסוגריים נרשום את שם המחלקה שנרצה שאובייקטים שלה יהיו מאוחסנים
        // after java version 6 we don't need to write the class name again in the second <>
        ArrayList<Dog> dogsList = new ArrayList<>();

        Dog d1 = new Dog("Bree");
        dogsList.add(d1);

        dogsList.add(new Dog("Lasi"));
        dogsList.add(new Dog("Humi"));

        dogsList.remove(0);


        ArrayList<String> list = new ArrayList<>();
        list.add("Maayan");

        System.out.println(dogsList.size());
        System.out.println(list.size());

        /*
        // array:
        for(int i = 0; i <dogsList.length; i++){
            System.out.println(dogsList[i].displayDetails());
        }
         */

        /*
        // arrayList:
        for(int i = 0; i <dogsList.size(); i++){
            System.out.println(dogsList.get(i).displayDetails());
        }
        */


        /*
        Integer i = 128;
        byte b = i.byteValue();
        System.out.println(b);
        */




    }
}

package com.company;


import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*
        // abstract class & interfaces cannot be instantiated!
        File f1 = new File();               // error - abstract class.
        Printable p1 = new Printable();     // error - interface.
         */

        Image d1 = new Image();

        WordDocument d2 = new WordDocument();

        PowerPointDocument d3 = new PowerPointDocument();

        File[] files = {d1, d2, d3};    // can be in file array because they extends File.
        Object[] obj = {d1, new String(""), new Date()};    // every class extends Object class.

        Date t1 = (Date) obj[2];

        Printable[] p = {d1, d2};

        files[0].getBytes();
    }
}

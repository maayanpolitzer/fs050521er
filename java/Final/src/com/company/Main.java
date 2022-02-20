package com.company;

public class Main {

    /*
    final class
    final method
    final field (global variable)
     */

    private static final int COUNTER = 5;
    private static final int COUNTER_FOR_MAIN_CLASS = 7;

    public static void main(String[] args) {

        // final fields examples:

        System.out.println(Integer.MIN_VALUE);

        Thread t1 = new Thread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        // final class:
        String s = "Moshe"; // String is final.

        // final method:
        EnglishTeacher e1 = new EnglishTeacher();
        e1.getDetails();
        // final method cannot be override.


    }
}



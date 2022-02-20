package com.company;

import java.util.Arrays;

public class Main {

    private static String[] months = {"January", "February", "March"};  // 36 bytes
    private static int selectedMonthIndex = 2;

    private  static Month[] months2 = {Month.JANUARY, Month.FEBRUARY, Month.MARCH}; // 12 bytes

    public static void main(String[] args) {

        // slow check but readable:
        if(months[selectedMonthIndex].equals("February")){

        }

        // quick check but not so readable
        if(selectedMonthIndex == 2){

        }

        // Enum - the possibility to be quick and readable and avoid mistakes
        Month mySelectedMonth = Month.FEBRUARY; // size: 1 int => 4 bytes.
        System.out.println(mySelectedMonth.getDays());
        /*
        if(mySelectedMonth == Month.FEBRUARY){

        }


         */
        switch (mySelectedMonth){
            case JUNE:
                System.out.println("Summer");
                break;
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                System.out.println("Winter");
                break;
            default:
                System.out.println("WTF?!?!");
        }
    }
}

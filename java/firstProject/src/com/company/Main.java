package com.company;

public class Main {

    // DRY => don't repeat yourself.

    public static void main(String[] args) {

        boolean b2 = false;

        byte age2 = 2;
        short k = -23546;
        int adir = 75531245;
        long a1 = 2000000000L; // also possible: 2_000_000_000L

        float n = 533.52f;  // float requires f at the end (and NOT double).
        double g2 = 12345.59;

        char c = 'D';       // 2 bytes.

        // arithmetic operations:
        int i = 0;
        i = 34;
        i += 12;    // i = i + 12;
        i++;    // i += 1;  // i = i + 1;
        i--;    // i -= 1;  // i = i - 1;
        i = 9;
        i *= 2; // 18
        i /= 10; // 18 / 10 = 1.8 => 1 (because it an INTEGER data type)
        i = 10;
        i %= 2;
        /*
        System.out.println(i);

        System.out.println(i++);    // the return value of this operation (function/method behind the scenes) is the original number.
        System.out.println(++i);    // the return value of this operation (function/method behind the scenes) is the updated number.
        System.out.println(i);
        */

        // conditions:
        int a = 50;
        boolean b = false;
        boolean d = !b;
        if (!(a == 50 || b || !d == b)) {
            //System.out.println("true");
        } else if (a % 3 == 0) {
            //System.out.println("false");
        } else {

        }

        // children (below 6) can't enter the roller coaster.
        // age 6 and above is welcome to enter.
        // age 10 will get free photo.
        int month = 8;

        // switch:
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("WTF!!!!");
        }

        /*
        if(age < 6){
            System.out.println("go home child!");
        }else{
            System.out.println("please come in!");
            if(age == 10){
                System.out.println("and receive free photo");
            }
        }
         */

        /*
        if(age < 6){
            System.out.println("go home child!");
        }else if(age == 10){
            System.out.println("please come in...");
            System.out.println("You will receive free photo");
        }else{
            System.out.println("please come in...");
        }
         */

        // loops:
        //while loop:
        int x = 10;
        while(x < 20){
            System.out.println("x is: " + x);
            x++;
        }

        // for loop:
        for(int j = 0; j < 5; j++){
            System.out.println("j is: " + j);
        }

        // array:


    }

}



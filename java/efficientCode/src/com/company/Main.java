package com.company;

public class Main {

    public static void main(String[] args) {
	    String msg = null;

	    /*
	    //Dog d = null;
	    //Cat c = null;
	    // null pointer exception
        //System.out.println(msg.equals(c));  // pointer does not point to an object (null), we cannot call a method on it
        */

        //System.out.println("x".equals(msg));

        if(msg == null || x() || y()){      // x(), y() will not be called, because the first condition is TRUE!
            msg = "WOW!";
        }

        System.out.println(msg);

        /*
        ???:
        1. "x".equals(msg) || msg == null       // 2
        2. msg.equals("x") || msg == null       // crash
        3. msg == null || "x".equals(msg)       // 1
        4. msg == null || msg.equals("x")       // 1
         */


        int height = 192;

        if(height >= 160){
            System.out.println("you can enter");
        }else if(height < 159){
            System.out.println("sorry you are too short");
        }else{
            System.out.println("lets check you height again");
        }


    }

    private static boolean x(){
        System.out.println("WOWOWOWOWOWOWOWOW");
        return false;
    }

    private static boolean y(){
        System.out.println("232323232");
        return false;
    }
}

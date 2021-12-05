package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 126;
        wow(true, -300, 5.99,true,b, -5000000);
        sum(5,8);
        int[] grades = {81, 80};
        double result = average(grades);
        //System.out.println(result);

        /*
        // save the average in the database.
        saveToDB(result);
        // send email the manager with the average.
        sendEmail(result);
        // display on the screen.
        display(result);
         */
    }



    public static void wow(boolean a, int b, double c, boolean s, byte d, int e){
        System.out.println("amazing!!!!");
    }

    public static boolean isNumberBiggerThan18(int number){
        return number > 18;
        /*
        if(number > 18){
            return true;    // return statement stop the function execution.
        }
        return false;
        */
        /*
        if(number > 18){
            return true;
        }else{
            return false;
        }
         */
    }

    public static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static double average(int[] arr){
        int sum = 0;
        for(int item: arr){
            sum += item;
        }
        /*
        for(int i = 0; i < arr.length; i++){
            int item = arr[i];
            sum += item;
        }
         */
        double res = sum / (double)arr.length;
        return res;
    }

}

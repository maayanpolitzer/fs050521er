package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] numbers = {1,2,3,4,5,6,7,8,9,10};     // sorted array! (ordered from the lowest to the highest).
        int i = 7;
        //System.out.println(isNumberInArray(i, numbers));

        //System.out.println(isNumberInArray(7, new int[]{1,2,3,4,5,6,7,8,9,10}));

        //printTheSumOfTwoNumber(6,2);
        /*
        int firstNumber = 7;
        int secondNumber = 1;
        printTheSumOfTwoNumber(firstNumber, secondNumber);
         */

        int[] longNumbers = new int[1000000];   // [1,10,56,......,170,4000,700000]
        for(int j = 0; j < longNumbers.length; j++){
           longNumbers[j] = j+1;
        }
        int k = 80000000;
        System.out.println(isNumberInArray(k, longNumbers));
    }

    /*
    public static void printTheSumOfTwoNumber(int a1, int a2){
        System.out.println(a1 + a2);
    }
     */

    // algorithmic thinking...
    public static boolean isNumberInArray(int number, int[] array){ // [1,2,3,4,6,9]  // length = 5;
        if(number > array[array.length - 1] || number < array[0]){
            return false;
        }
        int middle = array.length / 2;
        if(number == middle){
            return true;
        }
        if(number > middle){
            // loop from middle + 1 to the end.
            for(int i = middle + 1; i < array.length; i++){
                if(number == array[i]){
                    return true;
                }
            }
        }else{
            // loop from start to the middle.
            for(int i = 0; i < middle; i++){
                if(number == array[i]){
                    return true;
                }
            }
        }
        return false;
        /*
        for(int num : array){
            if(number == num){
                return true;
            }
        }
        return false;
         */
        /*
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                return true;
            }
        }
        return false;
         */
    }

}

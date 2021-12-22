package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    //int[] numbers = {1,2,3,4,6,9};     // sorted array! (ordered from the lowest to the highest).
        //int i = 1;
        //System.out.println(isNumberInArray(i, numbers));

        int[] numbers = new int[100000];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        //System.out.println(Arrays.toString(numbers));

        int i = 0;

        System.out.println(isNumberInArray(i, numbers));
    }

    // algorithmic thinking...
    // binary search algorithm.
    // sorted array.
    // O(log(n)) = סיבוכיות זמן
    public static boolean isNumberInArray(int number, int[] array){ // [1,2,3,4,6,9]  // length = 6;
        if(number > array[array.length - 1] || number < array[0]){
            return false;
        }
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int middle = (end + start) / 2;
            if(array[middle] == number){
                return true;
            }else if(array[middle] < number){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return false;
    }

}

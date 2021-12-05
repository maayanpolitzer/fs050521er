package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean firstLast3(int[] nums){
        // return true if the first value in the array is 3 and the last value in the array.
        // if not return false;
    }

    public static int[] createArray(int arrayLength, int lastValue){    // (4, 200)
        //return new int[]{0,0,0,200};
    }

    public static boolean has12(int[] numbers){
        // return true if there is value=1 in the array and somewhere later value=2
        // [6,7,3,1,4,6] => false
        // [6,7,3,1,4,2] => true
        // [6,7,3,2,1,2] => true
    }

    // complex!
    public static int[] x(int[] arr){   // [4,5,6,7,3,6,4,2]
        // split into groups the array where there is an odd number.  => [4,5], [6,7], [3], [6,4,2]
        // return a new array where every group is an item that the value is the sum of the group => [9,13,3,12]

        // [1,3,5,7] => [1],[3],[5],[7] => [1,3,5,7]
        // [2,4,6,8] => [2,4,6,8] => [20]
        // [5,4,8,8,7] => [5], [4,8,8,7] => [5, 27]
        // [] => [] => []
        // [1] => [1] => [1]
        // [400] => [400] => [400]
    }

}

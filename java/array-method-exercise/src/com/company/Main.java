package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 7};
        //System.out.println(firstLast3(arr));
        int[] arr2 = createArray(0, -800);
        printArray(arr2);

    }

    public static void printArray(int[] arr){
        if(arr == null){
            System.out.println("arr is null");
            return;
        }
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static boolean firstLast3(int[] nums) {
        // return true if the first value in the array is 3 and the last value in the array.
        // if not return false;
        /*
        if(nums.length > 0 && nums[0] == 3 && nums[nums.length - 1] == 3){
            return true;
        }
        return false;
         */
        return nums.length > 0 && nums[0] == 3 && nums[nums.length - 1] == 3;
    }


    public static int[] createArray(int arrayLength, int lastValue) {    // (4, 200)
        //return new int[]{0,0,0,200};
        if (arrayLength < 0) {
            return null;
        } else {
            int[] birkental = new int[arrayLength];
            if(birkental.length > 0) {
                birkental[birkental.length -1] = lastValue;
            }
            return birkental;
        }
    }


    public static boolean has12(int[] numbers){
        // return true if there is value=1 in the array and somewhere later value=2
        // [6,2,3,1,4,6] => false
        // [6,7,3,1,4,2] => true
        // [6,7,3,2,1,2] => true
        boolean oneWasFound = false;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1){
                oneWasFound = true;
                continue;
            }
            if(oneWasFound && numbers[i] == 2){
                return true;
            }
        }
        return false;
    }
    /*
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
     */

    // complex!
    public static int y(int[] arr){     // [60,10,34,30,76,45,60,2,34]
        // create 3 sub arrays from arr that contains at least 1 diamond (one value);
        // the value should be the highest.
        // return  12

        //[50,8,6,1,3,40,10,2] good luck (should return 9).
    }









}

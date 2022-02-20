package com.company;

public class Main {

    public static void main(String[] args) {
        /*
	    int[][] arr = {{6,-89, 3},{76, -9, 300}, {906, 450, 17}, {4,5,6}, {7,6,5}};

	    for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("i=" + i + ",j=" + j + ",value: " + arr[i][j]);
            }
        }


	    for(int i = 0; i < arr.length; i++){
	        int[] numbers = arr[i];
            for(int j = 0; j < numbers.length; j++){
                System.out.println(numbers[j]);
            }
        }



	    for(int[] numbers : arr){
            for(int value : numbers){
                System.out.println(value);
            }
        }
    */

	    boolean[][] arr = new boolean[30][50];

	    arr[1][1] = true;
        arr[1][2] = true;
        arr[1][3] = true;
        arr[2][1] = true;
        arr[2][2] = true;
        arr[2][3] = true;

	    // print:
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] ? "V" : " ");
            }
            System.out.println();
        }

    }
}

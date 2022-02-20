package com.company;

public class Main {

    private static boolean[][] arr = new boolean[14][100];

    public static void main(String[] args) {
        drawFullHorizontalLine(5);
        drawPartialHorizontalLine(7, 10, 40);
	    print();
    }

    private static void print(){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] ? "XXX" : "---");
            }
            System.out.println();
        }
    }

    private static void drawFullHorizontalLine(int top){
        drawPartialHorizontalLine(top, 0, arr[top].length);
    }

    private static void drawPartialHorizontalLine(int top, int left, int width){
        for(int j = left; j < left + width; j++){
            arr[top][j] = true;
        }
    }

    private static void drawFullVerticalLine(int left){

    }

    private static void drawPartialVerticalLine(int top, int left, int height){

    }

    private static void drawEmptySquare(int x, int left, int top){

    }

    private static void drawFullSquare(int x, int left, int top){

    }

    private static void drawEmptyRectangle(int width, int height, int left, int top){

    }

    private static void drawFullRectangle(int width, int height, int left, int top){

    }

    private static void drawCircle(int radius, int centerX, int centerY){

    }

}

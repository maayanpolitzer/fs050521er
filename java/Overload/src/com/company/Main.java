package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(67, -2345235));
    }

    // method signature automatically created for us.
    // sum(int, boolean);
    public static int sum(int x, boolean y){
        return 1;
    }

    // sum(int, int);
    public static int sum(int x, int y){
        return x;
    }

    // sum(boolean, int);
    public static int sum(boolean v, int x){
        return 3;
    }


}

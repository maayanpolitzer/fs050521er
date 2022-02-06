package com.company;

public class First extends Thread{

    private int numberOfIterations;

    public First(int loops){
        numberOfIterations = loops;
    }

    @Override
    public void run() {
        int number = 0;
        for(int i = 0; i < numberOfIterations; i++) {
            //number++;
            Main.updateCounter();
        }
        //Main.updateSum(number);
        System.out.println(Thread.currentThread().getName() + " ended");
    }

}

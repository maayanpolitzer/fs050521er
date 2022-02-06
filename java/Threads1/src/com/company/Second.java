package com.company;

public class Second extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 1000000; i++) {
            Main.updateCounter();
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}

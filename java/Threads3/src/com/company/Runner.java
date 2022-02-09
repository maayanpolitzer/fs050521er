package com.company;

public class Runner implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("working in new thread!");
    }
}

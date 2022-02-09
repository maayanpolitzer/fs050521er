package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new Runner());
	    t1.start();

	    new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("very quick way to create threads!");
            }
        }).start();

    }
}

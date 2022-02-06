package com.company;

public class Runner extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            Main.a();
            Main.b();
        }
    }
}

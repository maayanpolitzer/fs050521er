package com.company;

public class Main {

    private static int counterA = 0;
    private static int counterB = 0;

    public static void main(String[] args) {
        Runner r1 = new Runner();
        Runner r2 = new Runner();

        r1.start();
        r2.start();

        try {
            r1.join();
            r2.join();

            System.out.println("counterA: " + counterA);
            System.out.println("counterB: " + counterB);

        }catch(Exception e){

        }
    }

    public synchronized static void a(){
        counterA++;
    }

    public synchronized static void b(){
        counterB++;
    }

}

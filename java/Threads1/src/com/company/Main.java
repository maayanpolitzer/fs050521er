package com.company;

public class Main {

    // RACE CONDITION:
    public static int counter = 0;

    public synchronized static void updateCounter(){
        counter++;
        System.out.println(counter);
    }

    public synchronized static void updateSum(int number){
        counter += number;
    }

    public static void main(String[] args) {
        //System.out.println("start");
        //System.out.println("main() " + Thread.currentThread().getName());
        long from = System.currentTimeMillis();
        First t1 = new First(10000000);
        First t2 = new First(10000000);
        First t3 = new First(10000000);
        t1.start();
        t2.start();
        t3.start();
        //System.out.println("end");

        try{
            t1.join();  // keep executing only after t1 ended!
            t2.join();  // keep executing only after t2 ended!
            t3.join();  // keep executing only after t3 ended!
            long end = System.currentTimeMillis();
            System.out.println((end - from));
            System.out.println(counter);    // 18,000
        }catch(Exception ex){

        }
    }

    public static void y(){
        try {
            Thread.sleep(4000);
            System.out.println("y() " + Thread.currentThread().getName());
        }catch(Exception e){

        }
    }

    public static void x(){
        try {
            Thread.sleep(5000);
            System.out.println("x() " + Thread.currentThread().getName());
        }catch(Exception e){

        }
    }

}

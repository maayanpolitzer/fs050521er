package com.company;

import java.util.Random;

public class Main {

    /*
    p2 -> p1
    p1 ->
    p1 -> p2
    p1 -> p2
    p1 -> p2
     */

    static Random random = new Random();

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();

        // add shield will reduce the damage in life.
        // add multiple shots (not only one bullet).

        p1.setPlayerAsVIP();

        printPlayerStatus(p1);
        printPlayerStatus(p2);

        /*
        p2.shoot(p1, true);
        p1.shoot(p2, false);
        p2.shootMultiple(5, p1, true);
        for(int i = 0; i < 3; i++){
            p1.shoot(p2, true);
        }
         */
        int numOfRounds = 10;
        for(int i = 0; i < numOfRounds; i++){
            if(random.nextInt() % 2 == 0){
                p1.shoot(p2, random.nextInt() % 2 == 0);
            }else{
                p2.shoot(p1, random.nextInt() % 2 == 0);
            }
        }
        System.out.println("The winner is: " + (p1.score > p2.score ? "p1" : "p2" ));

        printPlayerStatus(p1);
        printPlayerStatus(p2);
    }



    public static void printPlayerStatus(Player player){
        System.out.println("life: " + player.life + ", score: " + player.score + ", ammo: " + player.ammo);
    }







    //        int thisYear = 2021;
//
//        Person maayan = new Person();
//        maayan.birthYear = 1986;
//        System.out.println("Maayan age: " + (thisYear - maayan.birthYear));
//
//        Person lev = new Person();
//        lev.birthYear = 1992;
//        System.out.println("Lev age: " + (thisYear - lev.birthYear));
}

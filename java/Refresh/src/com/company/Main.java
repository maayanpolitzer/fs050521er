package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Game game = Game.factory("monopoly");    // factory design pattern

        //Game game = new Game("Monopoly", 4, false, true, true, true);

        //Game monopoly = new Monopoly(1000, new String[]{"Maayan", "Ben"});
        Game monopoly = new Monopoly(800, "Maayan", "Avi", "Nitzan", "Joanne", "Linoy");
        //monopoly.start();
        System.out.println(monopoly);
        //monopoly.goToJail();
        if(monopoly instanceof Game) {
            Monopoly temp = (Monopoly) monopoly;
            temp.goToJail();
        }
    }
}

/**
 * abstract class - we cannot create object from this class. (new Game())...
 * an abstract class can have abstract methods.
 */
abstract class Game {

    private String name;
    private boolean hasBall;
    private int playersAmount;
    private boolean hasCube;
    private boolean hasCards;
    private boolean hasBoard;
    private int[] scores;

    public Game(String name, int playersAmount, boolean hasBall, boolean hasCube, boolean hasCards, boolean hasBoard){
        this.name = name;
        this.playersAmount = playersAmount;
        this.scores = new int[playersAmount];
        this.hasBall = hasBall;
        this.hasCube = hasCube;
        this.hasCards = hasCards;
        this.hasBoard = hasBoard;
    }

    public int[] getScores(){
        return scores;
    }

    public void start(){

    }

    public void end(){

    }

    /**
     * abstract method must be implemented by sub-class.
     * abstract method must be in abstract class.
     */
    public abstract void displayWinner();

//    public static Game factory(String name){
//        switch (name){
//            case "monopoly":
//                return new Monopoly();
//            case "soccer":
//                return new Soccer();
//            default:
//                return null;
//        }
//    }

}

class Soccer extends Game {

    public Soccer(){
        super("Soccer", 2, true, false, false, false);
    }

    @Override
    public void displayWinner(){
        int[] scores = getScores();
        if(scores[0] > scores[1]){
            System.out.println("first team won!");
        }else if(scores[1] > scores[0]){
            System.out.println("second team won!");
        }else{
            System.out.println("Tie!!");
        }
    }

}

class Monopoly extends Game {

    private ArrayList<Player> players;

    public Monopoly(int initialMoney, String... playerNames){
        super("Monopoly", playerNames.length, false, true, true, true);
        players = new ArrayList<Player>();
        for(int i = 0; i < playerNames.length; i++){
            players.add(new Player(playerNames[i], initialMoney));
        }
    }

    public void goToJail(){
        System.out.println("Player in jail!");
    }

    @Override
    public void start() {
        System.out.println("every player roll the cube, and the ..... will start and the other in clock wise");
    }

    public Monopoly(ArrayList<Player> players){
        super("Monopoly", players.size(), false, true, true, true);
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    @Override
    public void displayWinner() {

    }

    @Override
    public String toString() {
        return "Monopoly{" +
                "players=" + players +
                '}';
    }
}


class Player {

    private String name;
    private int money;

    public Player(String name, int money){
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}


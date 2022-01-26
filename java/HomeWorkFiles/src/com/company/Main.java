package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        // file operations:
        System.out.println("Welcome to the party");
        String text = null;
        while(true){
            System.out.println("type \"add\" to register , type \"check\" to check if a name is in the list, type \"new\" to create a new list (and delete the current), type \"exit\" to stop the app");
            text = scanner.nextLine();
            if(text.equals("add")){
                System.out.println("Please enter your name:");
                text = scanner.nextLine();
                System.out.println("thank you " + text);
                // add this (text) to the ArrayList;
            }else if(text.equals("check")){
                System.out.println("Please enter your name:");
                text = scanner.nextLine();
                System.out.println("checking if " + text + " is in the list");
                System.out.println("please wait...");
                System.out.println("loading...");
                //check if "text" is in the list.
                if(???) {
                    System.out.println(text + " is in the list!");
                }else{
                    System.out.println(text + " is NOT in the list");
                }
            }else if(text.equals("new")){
                // remove all data from ArrayList;
                System.out.println("The list is clear!");
            }else if(text.equals("exit")){
                System.out.println("Good bye!");
                break;
            }else{
                System.out.println("What????");
            }
        }
        // file operations:
    }
}

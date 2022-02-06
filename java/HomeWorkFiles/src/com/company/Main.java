package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> names = new ArrayList<>();

    private static String backupFile = "list.txt";

    public static void main(String[] args) {
        // file operations:
        restoreFromFile();
        System.out.println("Welcome to the party");
        String text = null;
        while(true){
            System.out.println("type \"add\" to register , type \"check\" to check if a name is in the list, type \"new\" to create a new list (and delete the current), type \"exit\" to stop the app");
            text = scanner.nextLine();
            if(text.equals("add")){
                System.out.println("Please enter your name:");
                text = scanner.nextLine();
                if(!names.contains(text)) {
                    names.add(text);
                    System.out.println("thank you " + text);
                    // add this (text) to the ArrayList;
                }else{
                    System.out.println(text + " is already in the list");
                }
            }else if(text.equals("check")){
                System.out.println("Please enter your name:");
                text = scanner.nextLine();
                System.out.println("checking if " + text + " is in the list");
                System.out.println("please wait...");
                System.out.println("loading...");
                //check if "text" is in the list.
                if(names.contains(text)) {
                    System.out.println(text + " is in the list!");
                }else{
                    System.out.println(text + " is NOT in the list");
                }
            }else if(text.equals("new")){
                // remove all data from ArrayList;
                names.clear();
                System.out.println("The list is clear!");
            }else if(text.equals("exit")){
                System.out.println("Good bye!");
                break;
            }else{
                System.out.println("What????");
            }
        }
        // file operations:
        backupToFile();
    }

    public static void restoreFromFile(){
        try {
            FileInputStream in = new FileInputStream(backupFile);
            // byte[] dataAsBytes = in.readAllBytes();
            // String data = new String(dataAsBytes);
            int actuallyRead;
            byte[] buffer = new byte[1024];
            String data = "";
            while((actuallyRead = in.read(buffer)) > -1){
                data += new String(buffer,0, actuallyRead);
            }
            String[] splitNames = data.split(";");    //  "Hello World".split(" "); => ["Hello", "World"]
            for(String name : splitNames){

                names.add(name);
            }
        }catch(Exception e){
            System.out.println("No backup file yet...");
        }
    }

    public static void backupToFile(){
        System.out.println("backup file!");
        try {
            FileOutputStream out = new FileOutputStream(backupFile);
            for(String name : names){
                out.write(name.getBytes());
                out.write(";".getBytes());  // new line for next name.
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

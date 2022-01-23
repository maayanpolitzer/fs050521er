package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = 30;
        try {
            age = scanner.nextInt();    // blocking method.
        }catch(Exception e){
            System.out.println("You didn't enter any valid number");
        }
        int year = 2022 - age -1;
        System.out.println("Your year of birth is: " + year);
    }
}

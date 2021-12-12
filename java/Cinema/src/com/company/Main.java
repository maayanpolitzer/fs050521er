package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Hall spidermanMovie = new Hall();
        System.out.println(Arrays.toString(spidermanMovie.seats));
        spidermanMovie.orderOneTicket();
        System.out.println(Arrays.toString(spidermanMovie.seats));

    }
}

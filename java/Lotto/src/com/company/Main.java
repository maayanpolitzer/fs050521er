package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myNumbers = {1,2,3,4,5,6};
        int myExtra = 1;

        Lotto lotto = new Lotto();
        lotto.generateLotto();
        System.out.println("Lotto generated numbers:" + Arrays.toString(lotto.numbers));
        int myPrize = lotto.checkMyGuess(myNumbers, myExtra);
        System.out.println("You won " + myPrize + " ILS.");
    }
}

package com.company;

import java.util.Random;

public class Lotto {

    int grandPrize = 500_000;
    int[] numbers = new int[6];
    int extra = 0;  // 1-8

    /**
     * this is the documentation for this method
     * @return true if the record is nice...
     */
    void generateLotto(){
        Random numberGenerator = new Random();
        extra = numberGenerator.nextInt(8) + 1; // generate a random number from 0 - 8 (without 9).
        int index = 0;
        while(index < numbers.length){
            int randomNumber = numberGenerator.nextInt(36) + 1;
            if(index == 0 || !isNumberInNumbersArray(randomNumber,index)){
                numbers[index] = randomNumber;
                index++;
            }
        }
        /*
        for(int i = 0; i < numbers.length; i++){
            int randomNumber = numberGenerator.nextInt(36) + 1;
            if(i > 0 && isRandomNumberInNumbersArray(randomNumber)){
                i--;
            }else{
                numbers[i] = randomNumber;
            }
        }
        */
    }

    boolean isNumberInNumbersArray(int number, int indexSearchBound){
        for(int i = 0; i < indexSearchBound; i++){
            int value = numbers[i];
            if(value == number){
                return true;
            }
        }
        return false;

        /*
        // we dont need to check all the values!
        for(int number : numbers){
            if(number == randomNumber){
                return true;
            }
        }
        return false;
         */
    }

    int checkMyGuess(int[] myNumbers, int myExtra){
        int counter = 0;
        for(int i = 0; i < myNumbers.length; i++){
            if(isNumberInNumbersArray(myNumbers[i], numbers.length)){
                counter++;
            }
        }
        System.out.println("hits: " + counter);
        int myPrize = 0;
        switch (counter){
            case 3:
                myPrize = 100;
                break;
            case 4:
                myPrize = 1000;
                break;
            case 5:
                myPrize = 10000;
                break;
            case 6:
                myPrize = grandPrize / 2;
                break;
            default:

        }

        if(myExtra == extra){
            // if we won money => multiply it by 2
            myPrize *= 2;
            System.out.println("you guessed the extra (" + myExtra + ")!");
        }else{
            System.out.println("you didn't guessed the extra, yours: " + myExtra + ", lotto extra: " + extra);
        }
        return myPrize;
        /*
        return myExtra == extra ? myPrize * 2 : myPrize;
         */
    }
}





















package com.company;

public class Main {

    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        System.out.println(d.size());
        d.printArray();                         //  []
        d.add(20);                              //  [20]
        d.add(50);                              //  [20, 50]
        d.add(60);                              //  [20, 50]
        d.add(5);                              //  [20, 50]
        d.add(0, -14);              //  [-14, 20 ,50]
        d.printArray();
        // must:
        //  [-14, 20 ,50]
        //d.set(1, -150); // [-14, -150, 50]  // 1 is the index, -150 is the value:

        //d.clear(); // [] // clear the array to its initial state

        //System.out.println(d.contains(50)); // true // return true if 50 is in the array. false if not

        //System.out.println(d.indexOf(1)); // -1 error // return the index where the value is 1 for the first time. if 1 is not in the array return -1;

        //System.out.println(d.get(2)); // array[2] // return the value in index 2. if there is one...

        //array =  [-14, 20 ,50]
        //d.remove(1);  //  delete the value in index 1. // [-14, 50]

        // extra:
        /*
        DynamicArray d2 = new DynamicArray();
        d2.add(3);
        d2.add(-5);
        //array =  [-14, 20 ,50]
        d.addAll(d2);   // [-14, 20, 50, 3, -5]
        */
        //System.out.println(d.isEmpty()); // false // return true if the array is empty, false if not empty.

    }
}

package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();  // Dog is an Animal? Yes => Dog can extend from Animal
        Cat c1 = new Cat("mitzi");

        Vehicle v1 = new Vehicle();     // Vehicle is an Animal? No => Vehicle will NOT extend from Animal

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(d1);
        animals.add(c1);

        for(int i = 0 ; i < animals.size(); i++){
            Animal a1 = animals.get(i);
            // down casting:
            if(a1 instanceof Dog) {
                Dog temp = (Dog) a1;
                temp.bark();
            }
        }

        /*
        // using an interface:
        ArrayList<FourPoint> list2 = new ArrayList<>();
        list2.add(d1);
        list2.add(c1);
        list2.add(v1);
         */

    }


}

package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();  // Dog is an Animal? Yes => Dog can extend from Animal
        Cat c1 = new Cat("mitzi");

        Object a = new Dog();

        Vehicle v1 = new BMW("pink");     // Vehicle is an Animal? No => Vehicle will NOT extend from Animal


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(d1);
        animals.add(c1);

        Animal q1 = new Dog();
        System.out.println("*********");
        q1.makeSound();



        // down casting:
        Dog q2 = (Dog) q1;
        q2.bark();

        /*
        for(int i = 0 ; i < animals.size(); i++){
            Animal a1 = animals.get(i);
            // down casting:
            if(a1 instanceof Dog) {
                Dog temp = (Dog) a1;
                temp.bark();
            }
        }

         */

        /*
        // using an interface:
        ArrayList<FourPoint> list2 = new ArrayList<>();
        list2.add(d1);
        list2.add(c1);
        list2.add(v1);
         */

        Object d = new Dog();       // because of inheritance => polymorphism.


        Vehicle v10 = new Fiat("Blue");
        Vehicle v11 = new Porche();
        Vehicle v12 = new BMW("Yellow");
//        Vehicle v13 = new Vehicle();  // ERROR, Vehicle is abstract class!

        v10.printMaxSpeed();
        v11.printMaxSpeed();
        v12.printMaxSpeed();
//        v13.printMaxSpeed();


    }

}

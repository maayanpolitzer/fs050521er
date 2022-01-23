package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Person p1 = new Person("Eli", "052-1234567");

        Person p2 = new Person("Eli", "052-1234567");

        Teacher t1 = new Teacher("Maayan", "050-2453452");

        Student s1 = new Student("Moshe", "1234234");

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(t1);
        people.add(s1);
        people.add(new Guard("Maayan", "0512345678"));

        for(Person p : people){
            //p.getCourse();
            /*
            if(p instanceof Teacher) {
                Teacher x = (Teacher) p;
                x.getCourse();
            }

             */

        }


//        for(int i = 0; i < people.size(); i++){
//            System.out.println(people.get(i).getPhone());
//            if(people.get(i) instanceof Student) {
//                Student s = (Student) people.get(i);
//                System.out.println(s.getGrades());
//            }else{
//                Teacher t = (Teacher) people.get(i);
//                System.out.println(t.getCourse());
//            }
//        }

        // next lesson:
        // equals!!!!!!!
        // Primive vs. object.
        // garbage collector.
        // protected.
        // Polymorphism.
        // abstraction.
        // Composition (has a).

//        Person temp = new Student("Awny", "3452");

//        Main m1 = new Main();

//        System.out.println(p1.getDetails());
//        System.out.println(t1.getDetails());

//        System.out.println(p1);
//        System.out.println(t1);
    }

}

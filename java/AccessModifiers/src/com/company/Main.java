package com.company;


public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("8686435", "blue", new Person("Maayan Politzer", "0529202968"));

        v1.changeOwner(new Person("Moshe Cohen", "0521234567"));
        // the same as:
        Person p2 = new Person("Eli", "0577777777");
        v1.changeOwner(p2);

        v1.printCurrentOwnerPhone();
        System.out.println("This program created " + Person.counter + " Person objects");
        System.out.println("This program created " + Vehicle.counter + " Vehicle objects");

        // use of static data (from Math class):
        System.out.println(Math.PI);
        System.out.println(Math.pow(5,3));  // 5*5*5 = 125

        // this code is inside a static method, so we can call only static methods.
        //sum(7,4);
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public int sum2(int x, int y){
        return x + y;
    }

}

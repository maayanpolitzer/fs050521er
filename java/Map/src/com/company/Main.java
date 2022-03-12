package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        HashMap<String, String> users = new HashMap<>();
        users.put("maayan@gmail.com", "abc123");
        users.put("dor@gmail.com", "abc123");
        // trying to add a new user with same email (and different password);
        if(!users.containsKey("maayan@gmail.com")) {
            users.put("maayan@gmail.com", "ABC");   // overrides the old value.
        }

        System.out.println(users.get("dor@gmail.com")); // prints the value of the key: "dor@gmail.com"
        */

        Company apple = new Company();

        /*
        apple.addNewEmployee(new Employee("Maayan", "052"));
        apple.addNewEmployee(new Employee("Elad", "054"));
        apple.addNewEmployee(new Employee("Linoy", "050"));
        */

        for(int i = 0; i < 20000; i++){
            apple.addNewEmployee(new Employee("A" + i, String.valueOf(i)));
        }

        //apple.print();
        apple.changeShiftStatus("0548796865");      // hashmap => 11399, arraylist => 2087876 (nano seconds)

        //apple.print();

    }



}

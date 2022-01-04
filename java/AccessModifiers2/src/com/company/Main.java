package com.company;

import com.example.Vehicle;

import java.util.ArrayList;

public class Main {

    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {

	    User u1 = new User("Maayan", "maayan@gmail.com", "123456", new Vehicle("Pink"));
        users.add(u1);

        User user = new User("Awny", "awny@gmail.com", "abc", new Vehicle("White"));
        users.add(user);

        users.add(new User("Moshe", "moshe@gmail.com", "aaa", new Vehicle("blue")));

        // bug #1: we allow anyone to change data in object.
        // users.get(0).id = 2;
        // solved: we added private access modifier.

        // bug #2: we can't view id because of private access modifier:
        // System.out.println(users.get(0).id);
        // solved: created getId() method.

        // Maayan decided that all fields (variables) will be private from now!

        // if we want to view a field, lets create a get method for it.
        //System.out.println(users.get(1).getName());

        // bug #3: how can we update the password?
        //u1.password = "111";
        // solved:


        /*
        int id = 2;
        User retrievedUser = getUserById(id);
        if(retrievedUser != null) {
            System.out.println(retrievedUser.getDetails());
        }else{
            System.out.println("There is no user with id " + id);
        }
         */

        System.out.println(u1.getDetails());

        u1.setPassword("111111");

        u1.setEmail("maayan.com");

        System.out.println(u1.getDetails());

        Vehicle v1 = new Vehicle("grey");
        System.out.println(v1.getColor());

    }

    static User getUserById(int id){
        /*
        for(User u : users){
            if(u.id == id){
                return u;
            }
        }
         */
        for(int i = 0; i < users.size(); i++){
            //System.out.println(users.get(i).getDetails());
            if(users.get(i).getId() == id){
                return users.get(i);
            }
        }
        return null;
    }
}

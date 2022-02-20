package com.company;

public class Teacher{

    //public class Teacher extends Person{

    String name;

    public final String getDetails(){
        return "My name is " + name;
    }

    public void wow(){
        System.out.println("teacher wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

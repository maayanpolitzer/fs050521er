package com.company;

// Super class / Parent class
public class Person{

    private String phone;
    private String name;

    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public Person(String name){
        this(name, null);
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getDetails(){
        return "Person => " + getFields();
    }

    public String getFields(){
        return "name: " + name + ",phone: " + phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }



}

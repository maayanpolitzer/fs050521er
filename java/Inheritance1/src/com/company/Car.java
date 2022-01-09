package com.company;


public class Car {

    // static members:

    // members:
    private String name;
    private int age;

    // constructors:

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // custom methods:
    public String sayHello(){
        return "Hello";
    }

    // override methods:
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    // getters & setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

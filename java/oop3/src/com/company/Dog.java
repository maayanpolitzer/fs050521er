package com.company;

public class Dog extends Animal {

    public Dog(){
        super("lasi");
    }

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("waff!");
    }

    public void bark(){
        System.out.println("Hau waff waff!!!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                '}';
    }
}

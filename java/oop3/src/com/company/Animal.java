package com.company;

public class Animal {

    String name;
    boolean vegetarian;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void makeSound(){
        System.out.println("rrrrrrr general animal sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                '}';
    }
}

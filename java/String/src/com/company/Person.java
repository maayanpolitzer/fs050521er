package com.company;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj){
        // the official answer:
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person temp = (Person) obj;
            return this.firstName.equals(temp.firstName) && this.lastName.equals(temp.lastName);
        }
        return false;
    }
}

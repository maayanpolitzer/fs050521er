package com.company;


import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<Short> grades;

    public Student(String name, String phone) {
        super(name, phone);
        this.grades = new ArrayList<>();
    }

    public ArrayList<Short> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }
}

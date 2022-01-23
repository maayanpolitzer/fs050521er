package com.company;


// sub-class:
public class Teacher extends Person {
// הבנאי של מורה חייב להפעיל בתוכו את הבנאי של המחלקה שהוא יורש ממנה

    private String course;

    public Teacher(String name, String phone){
        super(name, phone);
    }

    public Teacher(String name){
        this(name, null);
    }

    @Override //Annotation:
    public String getDetails(){
        return "Teacher => " + super.getFields() + ", course: " + course;
    }

    public String getCourse() {
        return course;
    }

}

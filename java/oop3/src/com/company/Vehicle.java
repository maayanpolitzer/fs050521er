package com.company;

// מחלקה אבסטרקטית:
// היא מחלקה כללית ברמה כזאת שלא נרצה לאפשר ליצור ממנה אובייקטים!
public abstract class Vehicle {

    private String color;

    public Vehicle(String color){
        this.color = color;
    }

    // המחלקה שמכילה את המתודה הזאת כללית מדי בשביל להגדיר את המתודה
    // כדי להפוך את המתודה למתודה אבסטרקטית (כלומר ללא גוף) אנחנו מחוייבים לעשות שני דברים:
    // מחלקות שירשו מהמחלקה הזאת, יהיו חייבות לממש את המתודה הזאת
    // המחלקה כולה תצטרך להיות אבסטרקטית
    public abstract void printMaxSpeed();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



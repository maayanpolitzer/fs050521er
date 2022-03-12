package com.company;

public class User {

    private int id;
    private String email;
    private String phone;
    private String name;
    private String about;

    public User(int id, String email, String phone, String name, String about) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.about = about;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}

package com.company;

import java.util.ArrayList;

public class Client {

    private static int counter = 0;

    private ArrayList<Pet> pets;
    private int clientNumber;
    private String name;
    private String phone;
    private boolean ads;

    public Client(String name, String phone, boolean ads){
        clientNumber = ++counter;
        this.name = name;
        this.phone = phone;
        this.ads = ads;
        pets = new ArrayList<>();
    }

    public boolean isAds() {
        return ads;
    }

    public void sendMessage(String content){

    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void removePet(int chipNumber){

    }

    public void setAds(boolean ads) {
        this.ads = ads;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "pets=" + pets +
                ", clientNumber=" + clientNumber +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", ads=" + ads +
                '}';
    }
}

package com.company;

public class House {

    private int rooms;
    private String address;
    private int sf;
    private String direction;
    private int bathrooms;
    private boolean active;

    public House() {
    }

    public House(int rooms, String address, int sf, String direction, int bathrooms) {
        this.rooms = rooms;
        this.address = address;
        this.sf = sf;
        this.direction = direction;
        this.bathrooms = bathrooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSf() {
        return sf;
    }

    public void setSf(int sf) {
        this.sf = sf;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

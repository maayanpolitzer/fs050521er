package com.company;

public class Employee {

    private String name;
    private String phone;
    private boolean inShift;

    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public int hashCode(){
        int hash = 0;
        for(int i = 0; i < phone.length(); i++){
            hash += (phone.charAt(i) ^ 7 +( i * 37));   // XOR => bitwise operators
        }
        return hash;
        //return phone.hashCode();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isInShift() {
        return inShift;
    }

    public void setInShift(boolean inShift) {
        this.inShift = inShift;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", inShift=" + inShift +
                '}';
    }
}

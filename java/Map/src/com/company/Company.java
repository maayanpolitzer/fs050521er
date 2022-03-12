package com.company;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees;

    public Company(){
        employees = new ArrayList<>();
    }

    public void addNewEmployee(Employee employee){
        employees.add(employee);
    }

    // O(n)
    public void changeShiftStatus(String phone){
        for(int i = 0; i < employees.size(); i++){
            Employee employee = employees.get(i);
            if(employee.getPhone().equals(phone)){
                employee.setInShift(!employee.isInShift());
            }
        }
    }

    public void print(){
        for(int i = 0; i < employees.size(); i++){
            Employee employee = employees.get(i);
            System.out.println(employee);
        }
    }

}

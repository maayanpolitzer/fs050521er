package com.company;

import java.util.HashMap;

public class ImprovedCompany {

    private HashMap<String, Employee> employees;

    public ImprovedCompany(){
        employees = new HashMap();
    }

    public void addNewEmployee(Employee employee){
        if(!employees.containsKey(employee.getPhone())) {
            employees.put(employee.getPhone(), employee);
        }
    }

    // O(1)
    public void changeShiftStatus(String phone){
        Employee employee = employees.get(phone);
        if(employee != null) {
            employee.setInShift(!employee.isInShift());
        }
    }

    public void print(){
        System.out.println(employees);
    }

}

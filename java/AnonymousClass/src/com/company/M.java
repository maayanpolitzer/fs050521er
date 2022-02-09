package com.company;

public class M implements X{
    @Override
    public int sum(int a, int b) {
        return (a + b) * 4;
    }

    @Override
    public void wow() {
        System.out.println("wow");
    }
}

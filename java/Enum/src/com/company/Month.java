package com.company;

public enum Month {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30);

    private int days;

    /* design pattern: singleton */
    private Month(int days){
        this.days = days;
    }

   public int getDays(){
        return days;
   }
}


package com.day3homework;

public class Evennumber {
    public static void main(String[] args) {
        //Printing all the even numbers till 100
        int [] arrEven = new int[100]; //declaration and instantiation
        int index = 0;
        for(int i = 2; i <= 200; i++) {
            if (i % 2 == 0) {
                arrEven[index] = i;   //assignment -- initialisation
                System.out.println(index + "th element: " + arrEven[index]);
                index++;
            }
        }
    }
}

package com.operators;

public class Ternary {
    public static void main(String[] args) {
        int days = 29;
        String result;
        result = (days == 28) ? "It is not a leap year" : "It is a leap year";
        System.out.println(result);
    }
}

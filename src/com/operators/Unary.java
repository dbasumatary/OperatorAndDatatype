package com.operators;

public class Unary {
    public static void main(String[] args) {
        int x = 12, y = 17;
        boolean z = true;

        System.out.println(x++);   //12
        System.out.println(++x);   //14
        System.out.println(x++ + ++x);   //30

        System.out.println(y++);   //17
        System.out.println(++y);   //19
        System.out.println(y++ + ++y);  //40

        System.out.println(!z);   //false
    }
}

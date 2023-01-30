package com.operators;

public class Relational {
    public static void main(String[] args) {
        int var1 = 5, var2 = 9;
        System.out.println("var1 = " + var1 + ", var2 = " + var2);

        System.out.println("var1 == var2: " + (var1 == var2));  // false
        System.out.println("var1 != var2: " + (var1 != var2));  // true
        System.out.println("var1 > var2: " + (var1 > var2));  // false
        System.out.println("var1 < var2: " + (var1 < var2));  // true
        System.out.println("var1 >= var2: " + (var1 >= var2));  // false
        System.out.println("var1 <= var2: " + (var1 <= var2));  // true
    }
}

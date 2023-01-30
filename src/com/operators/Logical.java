package com.operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println((7 > 5) && (8 > 5));  // true
        System.out.println((5 > 4) && (6 < 5));  // false

        System.out.println((9 < 8) || (7 > 6));  // true
        System.out.println((9 > 8) || (7 < 6));  // true
        System.out.println((9 < 8) || (7 < 6));  // false

        System.out.println(!(6 == 5));  // true
        System.out.println(!(6 > 5));  // false
    }
}

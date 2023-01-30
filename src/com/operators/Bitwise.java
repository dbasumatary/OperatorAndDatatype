package com.operators;

public class Bitwise {
    public static void main(String[] args) {
        int num1 = 12, num2 = 25;
        System.out.println(num1 | num2);   //OR 00001100 | 00011001 = 00011101 (29)
        System.out.println(num1 & num2);   //AND 00001100 & 00011001 = 00001000 (8)
        System.out.println(num1 ^ num2);   //XOR 00001100 | 00011001 = 00010101 (21)
        System.out.println(~num2);   //bitwise complement (-26)
    }
}

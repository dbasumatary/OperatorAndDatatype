package com.operators;

public class Shift {
    public static void main(String[] args) {
        int number1 = 12, number2 = 25;
        System.out.println("number1 << 2: " +(number1 << 2));   //2 bit signed left shift (48)
        System.out.println("number2 << 2: " +(number2 << 2));   //100

        System.out.println("number1 >> 2: " +(number1 >> 2));   //2 bit signed right shift 3
        System.out.println("number2 >> 2: " +(number2 >> 2));   //6

        System.out.println("number1 >>> 2: " +(number1 >>> 2));   //unsigned right shift (3)
        System.out.println("number2 >>> 2: " +(number2 >>> 2));   //6
        int number3 = -8;
        System.out.println("number3 << 2: " +(number3 << 2));   //-32
        System.out.println("number3 >> 2: " +(number3 >> 2));   //-2
        System.out.println("number3 >>> 2: " +(number3 >>> 2));   //1073741823

        System.out.println("number1 <<= 2: " +(number1 <<= 2));
        System.out.println("number1 >>= 2: " +(number1 >>= 2));
        System.out.println("number1 &= 2: " +(number1 &= 2));
        System.out.println("number1 ^= 2: " +(number1 ^= 2));
    }
}

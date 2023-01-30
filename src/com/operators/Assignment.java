package com.operators;

public class Assignment {
    public static void main(String[] args) {
        int d = 4, var;
        var = d;
        System.out.println("var using =: " + var);

        var += d;
        System.out.println("var using +=: " + var);

        var -= d;
        System.out.println("var using -=: " + var);

        var *= d;
        System.out.println("var using *=: " + var);

        var /= d;
        System.out.println("var using /=: " + var);

        var %= d;
        System.out.println("var using %=: " + var);
    }
}

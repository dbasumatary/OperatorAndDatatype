package com.controlflow;

public class Break {
    public static void main(String[] args) {
        //Using Break keyword in For loop
        int x;
        for(x=0; x<=50; x++ ) {
            if( x == 3 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }
    }
}

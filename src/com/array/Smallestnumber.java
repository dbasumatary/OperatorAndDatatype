package com.array;
public class Smallestnumber {
    public static void main(String[] args) {
        int [] smallNum = {61, 74, 23, 49, 52, 37};
        int min = smallNum[0];
        //Initially taking the first element as min then check and replace using for loop
        for(int i = 1; i < smallNum.length; i++){
            if (smallNum[i] < min){
                min = smallNum[i];
            }
        }
        System.out.println(min);
    }
}

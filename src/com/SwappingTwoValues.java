package com;

public class SwappingTwoValues {
    public static void main(String args[]){
        String x = "Hello";
        String y = "world";

        String temp;
        temp = x;
        x = y;
        y = temp;



        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}

package com;

import java.util.Scanner;

public class HypotenusTriangle {
    public static void main(String args[]) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of X: ");
        x =scanner.nextDouble();
        System.out.println("enter the value of y: ");
        y = scanner.nextDouble();
        z= Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenus of triangle is "+z);

    }
}
package com;

import java.util.Scanner;

public class InputFromKeyBoard {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your profession");
        String profession = scanner.nextLine();
        System.out.println("How many years of experience do you have?");
        int experience = scanner.nextInt();
        scanner.nextLine();
        System.out.println("which is your company");
        String company = scanner.nextLine();


        System.out.println("my profession is " +profession);
        System.out.println("I have "+experience+ " years of experience");
        System.out.println("my company is "+company);


    }
}

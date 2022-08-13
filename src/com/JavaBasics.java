package com;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class JavaBasics {

    public static void main(String args[]){
        System.out.println("good");
        byte b = -126;
        short s = -32768;
        int num = 100;
        char c = 'A';
        float f = 34.5f;
        double d = 2344.67;
        long l = 123333l;
        String name  = "Jeena";
        Boolean isOdd = true;

        // Reference Type Datatypes

        String studentName = new String("COM");
        LocalDate now = LocalDate.now();
        System.out.println(studentName);
        System.out.println(studentName.toLowerCase());
        System.out.println(b);
        System.out.println(s);
        System.out.println(num);
        System.out.println(f);
        System.out.println(d);
        System.out.println(name);
        System.out.println(isOdd);
        System.out.println(now);
        System.out.println(now.getDayOfMonth());
        System.out.println(now.isLeapYear());

    }



}

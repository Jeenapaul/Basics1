package com;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String args[]){
        //creating array
        int [] age = new int[2];
        age[0] = 3;
        age[1] = 4;
        System.out.println(Arrays.toString(age));
        int [] marks = {300,599,678,867};
        int value = marks[marks.length-1];
        System.out.println(value);

        // Another way of creating Array
        String [] name = {"jeena","sai","Georgy"};
        System.out.println(Arrays.toString(name));
        System.out.println(name.length);
        String[] cloneArray = name.clone();
        System.out.println(Arrays.toString(cloneArray));


    }

}

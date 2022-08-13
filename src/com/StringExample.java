package com;

public class StringExample {
    public static void main(String[] args){
        String name = new String("jeena");
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.contains("ee"));
        String code = new String("codes");
        System.out.println(code.equals(name));


    }
}

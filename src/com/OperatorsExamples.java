package com;

public class OperatorsExamples {
    public static void main(String args[]){
        System.out.println(10+2);
        System.out.println(10-2);
        System.out.println(10*2);
        System.out.println(10/2);
        System.out.println(10%3);
        //BODMAS
        System.out.println((10*2)/2*2+4-2);
        //Math function
        System.out.println(Math.max(4,7));
        System.out.println((int)Math.log(346));


        //comparison Operator
        int a = 9;
        int b = 4;
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>b);

        //Logical operator

        boolean ispresent = true;
        boolean isabsent = false;
        String name = "Jeena";
        System.out.println(isabsent || ispresent);
        System.out.println((10>8 || 2 <=2 && isabsent &&  name.contains("J")));

//Switch statements



    }
}

package com;

public class ReferenceTypes {
    public static void main(String args[]){
        person jeena = new person("jeena");
        person sai = jeena;
        System.out.println(jeena.name + " and " +sai.name);
        jeena.name="jo";
        System.out.println("after changing");
        System.out.println(jeena.name +" and " +sai.name);


    }
    static class person{
        String name;

        public person(String name) {
            this.name = name;
        }
    }
}

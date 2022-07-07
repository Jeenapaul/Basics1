package com;

public class ConditionalStatements {
    public static void main(String[] args) {
        String gender = "female";
        int score = 56;

        String message = score >= 18 ? "jeena passed in the exam" : "Jeena failed in the exam";
        System.out.println(message);
        if (score > 50) {
            System.out.println("pass");

        } else if (score >=50 && score ==50){
            System.out.println("pass");
        }

        switch (gender) {
            case "female" :
                System.out.println("I am female");
                break;
            case  "male" :
                System.out.println("I am Male");
                break;
            case "Not to specific" :
                System.out.println("not prefered to say");
                break;

        }
    }
    //Switch statements

}
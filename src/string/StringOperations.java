package string;

import java.util.Arrays;
import java.util.List;

public class StringOperations {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1 == str2) {
            System.out.println("str1==str2");
        } else
            System.out.println("str1 != str2");


        String str3 = new String("Hello");
        String str4 = new String("Hello");
        if (str3 == str4) {
            System.out.println("str1==str2");
        } else
            System.out.println("str1 != str2");
        if (str3.equals(str4)) {
            System.out.println("str3==str4");
        } else
            System.out.println("str3!=str4");
        ;


        //String Methods
        String str = "jeena, jim, teena, georgy,gregore";
        int len = str.length();
        System.out.println("Length is " + len);
        System.out.println(str.charAt(0));
        String str5 = str.toUpperCase();
        System.out.println(str5);

        if (str.contains("teena")) {
            System.out.println("teena is in the string");

            String s2 = str.substring(9);
            System.out.println("s2 is : " + s2);
            String s3 = str.replace("j", "O");
            System.out.println(" S3 is : " + s3);

            char[] charArray = str.toCharArray();
            for (char ch : charArray) {
                System.out.println(ch + " ");
            }
            String[] strArray = str.split(",");
            for (String st : strArray) {
                System.out.println(st);
            }
            String email = "jeena123@gmail.com";
            String mobile = "1234567890";
            String password = "hj";
            if (!email.isEmpty()) {
                System.out.println("Email is available");
                if (!(email.contains("@") && email.contains(".")) ){
                    System.out.println("Not a valid mailID");

                } else {
                    System.out.println("email is valid one");
                }
            } else {
                System.out.println("please provide mail_Id");

            }
            if(!mobile.isEmpty()){
                System.out.println("Ph number is available");
                if(mobile.length()!= 10){
                    System.out.println("ph number is incorrect");
                }else
                    System.out.println("ph number is correct");
            }
           // StringBuffer is mutable
            StringBuffer buffer = new StringBuffer("Hello");
            buffer.append(" world");
            System.out.println("buffer is:" +buffer);
           //StringBuilder is not thread safe-->In a multithreaded environment multiple threads can access the StringBuilder object simultaneously
            StringBuilder builder = new StringBuilder("Hello");
            builder.append(" world");
            System.out.println("buffer is:" +builder);
            if(!password.isEmpty()) {
                System.out.println("password is available");

                if(password.length()>5){
                    System.out.println("password is valid");

                }else {
                    System.out.println("password is not valid");
                }
            }
        }
    }
    }


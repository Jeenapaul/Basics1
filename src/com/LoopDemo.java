package com;

import java.util.Arrays;

public class LoopDemo {
    public static void main(String args[]){
        int[] marks = {56,64,57,23,65,87,45,58};


//       for(int i=0;i<marks.length;i++) {
//           System.out.println(marks[i]);
//           System.out.println(marks.length);
//           System.out.println(Arrays.stream(marks).count());
//           System.out.println(Arrays.stream(marks).max());
//           System.out.println(Arrays.stream(marks).findFirst());
//           System.out.println(Arrays.stream(marks).min());
//           System.out.println(Arrays.stream(marks).sum());
//
//       }
        int rows = 6;

//        for (int i = 1; i <= rows; ++i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }




        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    }


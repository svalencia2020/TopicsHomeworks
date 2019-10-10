package com.example.javahomework1;

public class Homework7 {

    //problem 1
    public static String removeSpaces(String str) {
        String finalstring = "";
        for(int i = 0; i< str.split(" ").length; i++) {
            System.out.println(finalstring + str.split(" ")[i]);
            finalstring = finalstring + str.split(" ")[i];
        }
        return finalstring;
    }

    //problem 2
    public static int move(int position, int roll) {

        return (position * position ) + roll;
    }

    //problem 3

        public static int[] countPositivesSumNegatives(int[] input)
        {
            if (input == null || input.length == 0) return new int[] {};
            int count = 0,sum = 0;
            for (int i : input) {
                if (i > 0) count ++;
                if (i < 0) sum += i;
            }
            return new int[] {count,sum};
        }
//
        }



    //problem 4
    public static String remove(String text) {
        String withoutFirstCharacter = text.substring(1); // index starts at zero
        String withoutLastCharacter = text.substring(0, text.length() - 1);
        return withoutFirstCharacter + withoutFirstCharacter;
    }



    //main class
        public static void main(String[] args) {

        removeSpaces("nice hair everyone");
        System.out.println(move(3,6));
        countPositivesSumNegatives(int[] input(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15));
        remove("happy");
}
}

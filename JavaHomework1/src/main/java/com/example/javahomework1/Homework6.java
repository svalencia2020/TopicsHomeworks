package com.example.javahomework1;

public class Homework6 {

    public static void gradeCalc (String gradeOne, int gradeTwo) {
        if ((gradeOne != "A") && (gradeOne != "B") && (gradeOne != "C")) { // if gradeOne is invalid
            System.out.println("Invalid gradeOne!");
        } else if ((gradeTwo < 0) || (gradeTwo > 100)) {
            System.out.println("Invalid");
        }
        else if (gradeOne == "A") { //if first test was A
            //test gradeTwo
            if (gradeTwo >= 75) {
                System.out.println("You get an A");
            } else {
                System.out.println("you get a B");
            }
        }
        else if (gradeOne == "B") {
            //B is gradeTwo >= 60
            if (gradeTwo >= 60) {
                System.out.println("You get a B.");
            } else {
                System.out.println("You get a C.");
            }

        } else  if (gradeOne == "C") {
            //B if >= 85
            if (gradeTwo >= 85) {
                System.out.println("You get a B.");
            } else if((gradeTwo >= 70) && (gradeTwo <=84)) {
              System.out.println("You get a C.");
            }else{
                System.out.println("You get an F");
            }
        }


    }


    public static String makeCap(String str){
        if(str.length()<=3){
            System.out.println(str.toUpperCase());
            return str.toUpperCase();
        } else {
            String normalpart = str.substring(0,str.length()-3);
            String uppercasepart = str.substring(str.length()-3).toUpperCase();
            System.out.println(normalpart + uppercasepart);
            return normalpart + uppercasepart;
        }
    }

    public static void main(String[] args) {
       gradeCalc("G",20);
        makeCap("happy");
    }
}

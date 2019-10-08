package com.example.javahomework1;

public class Homework6 {
    int gradeOne = 0;
    int gradeTwo = 0;

    public static void gradeCalc (int gradeOne, int gradeTwo){

        if(gradeOne>90 && gradeTwo>85) {
            System.out.println("Grade is an A.");
        }

        if(gradeOne<85 && gradeTwo>90) {
            System.out.println("Grade is an B.");
        }

        if(gradeOne>75 && gradeTwo>75) {
            System.out.println("Grade is an C.");
        }
    }

    public static void main(String[] args) {
System.out.println(gradeCalc(78,98));

    }
}

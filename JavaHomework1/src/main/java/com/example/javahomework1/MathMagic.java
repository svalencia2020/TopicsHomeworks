package com.example.javahomework1;

public class MathMagic {
    static int myNumber = 8;
    //the original number from now on
    static int stepOne = myNumber * myNumber;
    static int stepTwo = stepOne + myNumber;
    static int stepThree = stepTwo / myNumber;
    static int stepFour = stepThree + 17;
    static int stepFive = stepFour - myNumber;
    static int stepSix = stepFive / 6;

    public static void main(String[] args) {

        System.out.println(stepSix);


    }
}

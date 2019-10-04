package com.example.javahomework1;

public class JavaHomework5 {
    public static boolean or35(int n) {
        if ((n % 3 == 0) || (n % 5 == 0)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
                return true;
            } else{
                return false;
            }
    }



    public static String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    public static String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
    }
        return "not " +str;
    }

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true,false));
        System.out.println(front22("Kitten"));
        System.out.println(or35(45));
        System.out.println(front3("Lollipop"));
        System.out.println(notString("okay"));
    }



}





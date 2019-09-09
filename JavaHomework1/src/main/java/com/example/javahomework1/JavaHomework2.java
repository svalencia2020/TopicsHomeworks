package com.example.javahomework1;

public class JavaHomework2 {
    public static void main (String[] args){
        cdTimer2(4,21,3,21);
        cdTimer2(3,52,5,49);


    }
//    public static void cdTimer(int song1Mins, int song1Secs, int song2Mins,int song2Secs){
//        int twoSongSecs= (song1Secs + song2Secs);
//        int twoSongMins=(song1Mins + song2Mins);
//        System.out.println("This is the CD timer");
//
//        if(twoSongSecs>60){
//            twoSongMins=twoSongMins+1;
//        }
//        System.out.println("The number of minutes in song 1: " + song1Mins);
//        System.out.println("The number of minutes in song 1: " + song1Secs);
//        System.out.println("The number of minutes in song 2: " + song2Mins);
//        System.out.println("The number of minutes in song 1: " + song2Secs);
//        System.out.println(twoSongMins + " minutes and " + twoSongSecs + " seconds." );
//
//
//    }

    public static void cdTimer2(int song3Mins, int song3Secs, int song4Mins,int song4Secs){
        int bothSongSecs= (song3Secs + song4Secs);
        int bothSongMins=(song3Mins + song4Mins);
        System.out.println("This is the CD timer");

        if(bothSongSecs>60){
            bothSongMins=bothSongMins+1;
            bothSongSecs = bothSongSecs-60;


        }

        System.out.println("The number of minutes in song 1: " + song3Mins);
        System.out.println("The number of minutes in song 1: " + song3Secs);
        System.out.println("The number of minutes in song 2: " + song4Mins);
        System.out.println("The number of minutes in song 2: " + song4Secs);
        System.out.println(bothSongMins + " minutes and " + bothSongSecs + " seconds." );


    }









}

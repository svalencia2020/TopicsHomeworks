package com.example.javahomework1;

public class Homework8 {

    //problem 1
    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] ==  nums[nums.length-1]);
// nums.length >= 1  -  checks to see if array is greater than or equal to 1
        // nums[0] ==  nums[nums.length-1]  -  checks to see if the first and last item in array is equal
    }

    //problem 2
    public static int[] plusTwo(int[] a, int[] b) {
        int [] add = {a[0], a[1],b[0], b[1]};
        return add;
    }
    public static int[] largerTwo(int[] a, int[] b){

        int sum = a[0] + a[1] - b[0]-b[1];
        if(sum>=0)
            return a;
            return b;
    }

    public static int[] sum3(int[] numnum){
        return (numnum[0 + numnum[1] + numnum[2]]);
    }

    public static void main (String[]args){
        System.out.println(sameFirstLast(new int[]{1,3,1}));
        System.out.println(plusTwo(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(largerTwo(new int[]{1,7}, new int[]{8,5}));
        System.out.println(sum3(new int[]{1,6,8}));


    }
    }

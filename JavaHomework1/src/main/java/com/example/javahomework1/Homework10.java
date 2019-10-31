package com.example.javahomework1;

public class Homework10 {

    //problem 1
    public static int bigDiff(int[] nums) {
        //variables for biggest and smallest number
        int biggestNum =0;
        int smallestNum =0;

        //checking to make sure length of array is bigger than 1, also setting i to zero and adding i to itself so we go through each number in the list
        for(int i=0; nums.length>1; i++){
            if(nums[i]>biggestNum) {
                biggestNum = nums[i];
            } else if(nums[i]<smallestNum) {
                smallestNum = nums[i];
            }
        }

        System.out.println(biggestNum-smallestNum);
    }

    //problem 2

    public static int[] tenRun(int[] nums) {
        int tenMult = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 10 == 0)
                tenMult = nums[i];
            else if(tenMult != -1)
                nums[i] = tenMult;
        }
        return nums;
    }


//problem 3

    public static int[] withoutTen(int[] nums) {
        int p = 0;
        int[] array = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 10)
            {
                nums[i] =   array[p];
                p++;
            }
        }
        return array;
    }


    //problem 4
    public static boolean haveThree(int[] nums) {

        boolean isPerfect3 = false;
        int count = 0;
        for(int i = 0 ; i < nums.length && count <= 3; i++)
        {
            if(nums[i] == 3)
            {
                if(isPerfect3)
                    return false;
                else
                {
                    count++;
                    isPerfect3 = true;
                }
            }
            else
                isPerfect3 = false;
        }
        return (count == 3);
    }




     static void main(String[]args) {
        //problem 1 test
        System.out.println(bigDiff(new int[] {10, 3, 5, 6}));
        System.out.println(bigDiff(new int[] {7, 2, 10, 9}));
        System.out.println(bigDiff(new int[] {2, 10, 7, 2}));

        //problem 2 test
        System.out.println(tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        System.out.println(tenRun(new int[]{10, 1, 20, 2}));
        System.out.println(tenRun(new int[]{10, 1, 9, 20}));

        //problem 3 test
         System.out.println(withoutTen(new int[] {1, 10, 10, 2}));
         System.out.println(withoutTen(new int[] {10, 2, 10}));
         System.out.println(withoutTen(new int[] {1, 99, 10}));

         //problem 4 test
         System.out.println(haveThree(new int[]{3, 1, 3, 1, 3}));
         System.out.println(haveThree(new int[]{3, 1, 3, 3}));
         System.out.println(haveThree(new int[]{3, 4, 3, 3, 4}));



     }
}

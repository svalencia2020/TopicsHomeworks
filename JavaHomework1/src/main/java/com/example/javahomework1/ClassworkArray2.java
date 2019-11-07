package com.example.javahomework1;

public class ClassworkArray2 {


    //problem 1
    public static boolean no14(int[] nums) {
        boolean noOnes=true;
        boolean noFours=true;

        for(int i =0; i<nums.length && (noOnes || noFours); i++){
            if(nums[i]==1){
                noOnes =false;
            }
            if(nums[i]==4){
                noFours =false;
            }

        }
        return (noOnes || noFours);
    }


    public static boolean either24(int[] nums) {
       boolean twoTwo = true;
       boolean fourFour = true;
        for (int i = 0; i<nums.length-1; i++){
            if(nums[i] == 2 && nums[i+1] == 2){
                twoTwo=false;
            }
            if(nums[i] == 4 && nums[i+1] == 4){
                fourFour=false;
            }
        }
        return twoTwo != fourFour;
    }


    public static void main(String[]args){
        //test 1
        System.out.println("problem 1 ");
        System.out.println(no14(new int[]{1, 2, 3}));
        System.out.println(no14(new int[]{1, 2, 3, 4}));
        System.out.println(no14(new int[]{2, 3, 4}));



    //test 2
        System.out.println("problem 2 ");
        System.out.println(either24(new int[] {1, 2, 2}));
        System.out.println(either24(new int[] {4, 4, 1}));
        System.out.println(either24(new int[] {4, 4, 1, 2, 2}));





    }

}

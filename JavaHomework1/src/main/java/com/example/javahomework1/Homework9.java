package com.example.javahomework1;

public class Homework9 {


    //problem 2
    public static void removeEvenLength(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.length() % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
    }

//problem3
    public static boolean isUnique(int a[]) {

        for(int i=0;i<a.length;i++) {

            for(int j=i+1;j<a.length;j++) {

                if(a[i]==a[j]) {

                    return false;

                }

            }

        }

        return true;
    }

}

//problem 4
public static boolean isSorted(double[] array) {
    double pre = array[0];

    for (int i = 1; i < array.length; i++) {
        double current = array[i];
        if (pre >= current) {
            return false;
        }
        pre = current;
    }

    return true;
}








    static void main(String[] args){

        System.out.println(removeEvenLength(new ArrayList< >(Arrays.asList("London", "Tokyo", "New York"))));
        System.out.println(removeEvenLength(new ArrayList< >(Arrays.asList("coffee", "donut", "cookie", "cupcake"))));

        //problem 3 inputs
        System.out.println(isUnique(new int[] {7, 3, -54, 0, 5, 3, -100}));
        System.out.println(isUnique(new int[] {1, 9, -7, 5, 3}));

        System.out.println(isSorted(new double[] {16.1, 12.3, 22.2, 14.4}));
        System.out.println(isSorted(new double[] {28.9,4.6,5.14}));


    }
}

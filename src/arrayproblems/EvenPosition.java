package com.arrayproblems;


public class EvenPosition {
    
    public static void main(String[] args) {
        //initilizing an array
        int[] arrary = {2, 5, 6, 8, 4, 2, 3, 1, 5, 9, 3, 4};
        System.out.println("Elements of given array present on even position: ");
        for (int i = 1; i < arrary.length; i = i + 2) {

            System.out.println(arrary[i]);
        }
    }
}

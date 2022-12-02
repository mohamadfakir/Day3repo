package com.arrayproblems;

import java.util.Scanner;

public class ReverseOrder {
    
    public static void main(String[] args) {
        System.out.println("enter the number of elements you want to enter\n");
        Scanner n = new Scanner(System.in);
        int ar = n.nextInt();
        int arr[] = new int[ar];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.nextInt();

        }
        for (int i = arr.length-1; i >= 0 ; i-- ){


            System.out.println(arr[i]);

        }
    }
}

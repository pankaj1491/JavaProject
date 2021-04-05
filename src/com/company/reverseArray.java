package com.company;
import java.util.*;

public class reverseArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        int length = arr.length;
        for(int i=0;i<length/2;i++) {
            int swap = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] = swap;
        }
    }
}

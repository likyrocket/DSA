package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,5,2,3,6};
        int n = arr.length;
        int k = 3;

        ArrayList<Integer> result =KSizedSubarrayMaximum.max_of_subarrays(arr, n, k);

        System.out.println("The maximum of each subarray of size " + k + " is: " + result);
    }
}
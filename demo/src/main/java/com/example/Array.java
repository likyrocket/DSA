package com.example;

public class Array {

    static int search(int arr[], int x) {
        // Your code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1; // return -1 if the element is not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int x = 3;
        int result = search(arr, x);
        System.out.println("Element " + x + " is at index: " + result);
    }
}


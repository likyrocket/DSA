package com.example;

public class Array {

    // Method to search for an element in the array
    static int search(int arr[], int x) {
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // If the element is found, return the index
            if (arr[i] == x) {
                return i;
            }
        }
        // If the element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {2, 3, 4, 10, 40};
        // Element to search for
        int x = 10;

        // Call the search method and print the result
        int result = search(arr, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}



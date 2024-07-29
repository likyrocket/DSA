package com.example;
class MissinginArray {
    int missingNumber(int n, int arr[]) {
        int sum1 = 0;
        for (int i = 0; i < n - 1; i++) {
            sum1 += arr[i];
        }
        int var1 = n * (n + 1) / 2;
        int diff = var1 - sum1; // Corrected difference calculation
        return diff;
    }

    public static void main(String[] args) {
        MissinginArray MissinginArray = new MissinginArray();
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Example input
        int n = 8; // The size of the array should be n-1, so n is 8
        System.out.println("Missing number is: " + MissinginArray.missingNumber(n, arr)); // Should print 5
    }
}




package com.example;

public class WaveArray {
    public static void convertToWave(int n, int[] arr) {
        // code here
        for(int i = 1; i < n; i += 2) {
            // Swap arr[i] and arr[i-1]
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }
}
    
    


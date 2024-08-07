package com.example;

public class WaveArray {
    public void convertToWave(int n, int[] arr) {
        // code here
        for (int i = 1; i < n; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        WaveArray solution = new WaveArray();
        solution.convertToWave(n, arr);

        System.out.println("Wave array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    
    


package com.example;

import java.util.ArrayList;

public class KSizedSubarrayMaximum {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        int left = 0, right = k - 1;
        int maxIndex = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Finding the maximum element in the first subarray
        for (int i = 1; i < k; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        result.add(arr[maxIndex]);

        // Moving the window
        left++;
        right++; 

        while (right < n) {
            if (arr[right] > arr[maxIndex]) {
                maxIndex = right;
            } 
            else {
                if (maxIndex < left) { // maxIndex went out of the bounds of the current window
                    maxIndex = left;
                    for (int i = left + 1; i <= right; i++) {
                        if (arr[i] > arr[maxIndex]) maxIndex = i;
                    }
                }
            }
            result.add(arr[maxIndex]);
            left++;
            right++;
        }

        return result;
    }
}
       

    


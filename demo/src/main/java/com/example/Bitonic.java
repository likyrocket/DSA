package com.example;
//test
public class Bitonic {
    int findMaximum(int[] arr, int size) {
        int left = 0, right = size - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == size - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            } else if (mid < size - 1 && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] arr = {1, 15, 25, 45, 42, 21, 17, 12, 11};

        Bitonic solution = new Bitonic();
        int maximum = solution.findMaximum(arr, n);

        System.out.println("Maximum element in the array: " + maximum);
    }
}


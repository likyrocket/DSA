package com.example;

public class HeapSort {
    void buildHeap(int arr[], int n) {
        // Index of the last non-leaf node
        for (int i = (n - 2) / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root          //arr[] = {10,9,8,7,6,5,4,3,2,1}
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left; 
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n) {
        // Build heap (rearrange array)
        buildHeap(arr, n);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
}
    


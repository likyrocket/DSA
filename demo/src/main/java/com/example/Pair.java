package com.example;
 class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
    
    
    
}

 class MinandMaxinArray {
    public Pair<Long, Long> getMinMax(int[] arr) {
        long min = arr[0];
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new Pair<>(min, max);
    }

    public static void main(String[] args) {
        MinandMaxinArray solution = new MinandMaxinArray();
        int[] arr = {3, 2, 1, 56, 10000, 167};
        Pair<Long, Long> result = solution.getMinMax(arr);
        System.out.println("Min and Max values: " + result);
    }
}
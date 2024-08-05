package com.example;

public class MaximumSumRectangle {
    int maximumSumRectangle(int R, int C, int M[][]) {
        // code here
        int maxArea = Integer.MIN_VALUE;  // Initialize to the smallest possible value
        for (int startCol = 0; startCol < C; startCol++) {
            int[] num = new int[R];
            for (int endCol = startCol; endCol < C; endCol++) {
                for (int row = 0; row < R; row++) {
                    num[row] += M[row][endCol];
                }
                int area = kadane(num);
                maxArea =  Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    private int kadane(int[] num) {
        int sum = 0;
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            if (maxArea < sum) {
                maxArea = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxArea;
    }
    
}
    


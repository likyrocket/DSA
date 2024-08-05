package com.example;

public class Rotateby90degree {
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        int row = 0, col = n - 1;
        while (row < col) {
            for (int i = 0; i < n; i++) {
                int temp = matrix[row][i];
                matrix[row][i] = matrix[col][i];
                matrix[col][i] = temp;
            }
            row++;
            col--;
        }
    }

}   
    


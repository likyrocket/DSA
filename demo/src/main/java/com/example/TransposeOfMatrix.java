package com.example;

public class TransposeOfMatrix {
    public void transpose(int n,int a[][])
    {   
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=a[j][i];
            }
        }
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=arr[i][j];
            }
        }
    }
}
    


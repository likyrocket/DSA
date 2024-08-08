package com.example;

public class CoinChange {
    public long count(int coins[], int N, int sum) {
        long[][] arr = new long[N + 1][sum + 1];

        // Initialize the first column as 1, which is the base case
        for (int i = 0; i <= N; i++) {
            arr[i][0] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] > j) {
                    arr[i][j] = arr[i - 1][j];
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - coins[i - 1]];
                }
            }
        }

        return arr[N][sum];
    }

    public static void main(String[] args) {
        CoinChange solution = new CoinChange();
        int[] coins = {2, 5, 3, 6};
        int N = coins.length;
        int sum = 10;

        long result = solution.count(coins, N, sum);
        System.out.println("Number of ways to make change: " + result);
    }
}
    


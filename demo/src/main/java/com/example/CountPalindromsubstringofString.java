package com.example;

public class CountPalindromsubstringofString {
    public int CountPS(String s, int n) {
        // code here
        int[][] dp = new int[n][n];
        int ans = 0;

        // Loop over all possible lengths of substrings
        for (int dif = 0; dif < n; dif++) {
            for (int i = 0, j = i + dif; j < n; j++, i++) {
                if (i == j) {
                    dp[i][j] = 1; // A single character is always a palindrome
                } else if ((j - i) == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) ? 1 : 0; // Check for two-character palindrome
                } else if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1; // Check for longer palindromes
                }

                if ((j - i + 1) > 1 && dp[i][j] == 1) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        CountPalindromsubstringofString sol = new CountPalindromsubstringofString();
        String input = "abaab";
        int n = input.length();
        int result = sol.CountPS(input, n);
        System.out.println("Number of palindromic substrings: " + result);
    }
}


    
    


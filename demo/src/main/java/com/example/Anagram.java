package com.example;

public class Anagram {
    public boolean isAnagram(String a, String b) {
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        int index;

        // Increment counts for characters in string 'a'
        for (int i = 0; i < a.length(); i++) {
            index = a.charAt(i) - 'a';
            arr[index]++;
        }

        // Increment counts for characters in string 'b'
        for (int i = 0; i < b.length(); i++) {
            index = b.charAt(i) - 'a';
            arr2[index]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram  solution = new Anagram ();
        String a = "listen";
        String b = "silent";

        if (solution.isAnagram(a, b)) {
            System.out.println(a + " and " + b + " are anagrams.");
        } else {
            System.out.println(a + " and " + b + " are not anagrams.");
        }
    }
}
    


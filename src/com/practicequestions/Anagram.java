package com.practicequestions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "ankit";
        String s2 = "Tikna";

        if (isAnagram3(s1, s2)) {
            System.out.println("Strings are Anagram!");
        } else {
            System.out.println("Strings are not Anagram!");
        }
    }

    // O(nLogn) and n space. Can work with any letters
    private static boolean isAnagram1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        s1 = new String(a1);
        s2 = new String(a2);

        return s1.equals(s2);
    }

    // O(n) Time and O(1) Space. Will only work with alphabets
    private static boolean isAnagram2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int n = s1.length();
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            }

            ch = s2.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']--;
            } else if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // O(n) time and O(1) space. Can also handle any characters
    public static boolean isAnagram3(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int n = s1.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= s1.charAt(i) ^ s2.charAt(i);
        }

        return result == 0;
    }
}

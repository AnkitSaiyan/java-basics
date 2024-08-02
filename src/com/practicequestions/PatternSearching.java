package com.practicequestions;

public class PatternSearching {
    public static void main(String[] args) {
        String str1 = "abddababa";
        String str2 = "aba";

        searchPattern(str1, str2);
    }

    private static void searchPattern(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return;
        }

        int i = 0, j = 0;
        int n1 = s1.length(), n2 = s2.length();

        while (i <= n1 - n2) {
            if (s1.charAt(i + j) == s2.charAt(j)) {
                if (j == n2 - 1) {
                    System.out.println(i);
                    i++;
                    j = 0;
                } else {
                    j++;
                }
            } else {
                i++;
                j = 0;
            }
        }
    }
}
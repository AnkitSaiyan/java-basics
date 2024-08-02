package com.practicequestions;

public class Palindrome {
    public static void main(String[] args) {
        String s = "nitin";
        if (isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, n = s.length() - 1; i < n; i++, n--) {
            if (s.charAt(i) != s.charAt(n)) {
                return false;
            }
        }
        return true;
    }
}

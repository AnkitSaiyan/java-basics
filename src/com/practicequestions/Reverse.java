package com.practicequestions;

public class Reverse {
    public static void main(String[] args) {
        String s = "Ankita";
        System.out.println(reverse(new StringBuilder(s)));
    }

    public static StringBuilder reverse(StringBuilder s) {
        if (s.length() <= 1) {
            return s;
        }

        for (int i = 0, n = s.length() - 1; i < n; i++, n--) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(n));
            s.setCharAt(n, temp);
        }

        return s;
    }
}

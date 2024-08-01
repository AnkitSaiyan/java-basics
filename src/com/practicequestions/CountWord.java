package com.practicequestions;

public class CountWord {
    public static void main(String[] args) {
        String str = "Ankit is Champ !";
        int count = countWords(str);
        System.out.println("Count of string \"" + str + "\" is " + count);
    }

    private static int countWords(String str) {
        int count = str.charAt(0) != ' ' ? 1 : 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }
}

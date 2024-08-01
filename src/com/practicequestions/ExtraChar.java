package com.practicequestions;

import java.util.Arrays;

/*
    s1 is n and s2 is n + 1
    There is one extra char in s2 which is not in s1.
    characters can be in any order. e.g.,
    s1 -> abcd
    s2 -> adceb
    output -> e
    Note: String will only contain alphabets
*/
public class ExtraChar {
    public static void main(String[] args) {
        char extra = findExtraChar("abcd", "adceb");
        System.out.println(extra);
    }

    public static char findExtraChar(String s1, String s2) {
        int[] count = new int[26];

        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                count[s1.charAt(i) - 'a']--;
            } else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                count[s1.charAt(i) - 'A']--;
            }

            if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') {
                count[s2.charAt(i) - 'a']++;
            } else if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z') {
                count[s2.charAt(i) - 'A']++;
            }
        }

        if (s2.charAt(n) >= 'a' && s2.charAt(n) <= 'z') {
            count[s2.charAt(n) - 'a']++;
        } else if (s2.charAt(n) >= 'A' && s2.charAt(n) <= 'Z') {
            count[s2.charAt(n) - 'A']++;
        }

        System.out.println(Arrays.toString(count));
        n = count.length;
        for (int i = 0; i < n; i++) {
            if (count[i] == 1) {
                return (char)(i + 'a');
            }
        }
        return  0;
    }
}

package com.practicequestions;

import java.util.Scanner;

public class NDaysBeforeGivenDay {
    public static void main(String[] args) {
        System.out.println("Please enter the day (0 - 6):");
        Scanner sc = new Scanner(System.in);
        byte day = sc.nextByte();
        if (day < 0 || day > 6) {
            System.out.println("Wrong input");
            return;
        }
        System.out.println("Please how many days before:");
        int N = sc.nextInt();
        int ans = day - N % 7 > 0 ? day - N % 7 : day - N % 7 + 7;
        System.out.printf("%d days before %d was %d", N, day, ans);
    }
}

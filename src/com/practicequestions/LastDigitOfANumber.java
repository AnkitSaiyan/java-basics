package com.practicequestions;

import java.util.Scanner;

public class LastDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit = getLastDigit(num);
        System.out.printf("Last digit %d is %d", num, lastDigit);
    }

    private static int getLastDigit(int num) {
        int remainder = num % 10;
        return Math.abs(remainder);
    }
}

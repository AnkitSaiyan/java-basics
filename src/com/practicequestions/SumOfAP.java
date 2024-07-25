package com.practicequestions;

import java.util.Scanner;

public class SumOfAP {
    public static void main(String[] args) {
        System.out.println("Please enter the first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter total numbers:");
        int n = sc.nextInt();
        System.out.println("Enter the difference between numbers");
        int d = sc.nextInt();
        int sum = (2 * a + (n - 1) * d) * n / 2;
        System.out.printf("Sum is %d", sum);
    }
}

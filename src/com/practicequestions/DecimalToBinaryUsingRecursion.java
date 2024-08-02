package com.practicequestions;

public class DecimalToBinaryUsingRecursion {
    public static void main(String[] args) {
        int decimal = 10;
        System.out.println("Binary: " + toBinary(decimal));
    }

    public static int toBinary(int num) {
        if (num == 0) {
            return 0;
        }

        return 10 * toBinary(num / 2) + num % 2;
    }
}

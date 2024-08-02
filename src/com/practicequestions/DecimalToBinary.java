package com.practicequestions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        String decimal = "10";
        int dec = 10;
        System.out.println("Binary (String to Number): " + decimalToBinary(decimal));
        System.out.println("Binary (Number to Number): " + decimalToBinary(dec));
    }

    public static int decimalToBinary(String dec) {
        if (Objects.equals(dec, "")) {
            return 0;
        }
        int n = Integer.parseInt(dec);
        StringBuilder binary = new StringBuilder();
        while (n > 0){
            binary.insert(0, n % 2);
            n /= 2;
        }
        return Integer.parseInt(new String(binary));
    }

    public static int decimalToBinary(int dec) {
        int temp = dec;
        int length = 0;
        while (temp > 0) {
            temp /= 2;
            length++;
        }

        boolean[] binary = new boolean[length];
        for (int i = 0; i < length; i++) {
            binary[i] = dec % 2 != 0;
            dec /= 2;
        }

        int result = 0;
        for (int i = length - 1; i >= 0; i--) {
            result *= 10;
            result += binary[i] ? 1 : 0;
        }

        return result;
    }
}

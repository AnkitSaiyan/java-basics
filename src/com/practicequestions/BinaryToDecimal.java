package com.practicequestions;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "10001000";
        System.out.println(binaryToDecimal(binary));
    }

    private static int binaryToDecimal(String binary) {
        int dec = 0;
        int n = binary.length() - 1;
        for (int i = n; i >= 0; i--) {
            dec += Integer.parseInt(String.valueOf(binary.charAt(i))) * Math.pow(2, n - i);
        }
        return dec;
    }
}

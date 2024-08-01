package com.practicequestions;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementCommonInAllRows {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 1, 14, 3, 16},
                {14, 2, 1, 3, 35},
                {14, 1, 14, 3, 11},
                {14, 5, 3, 2, 1},
                {1, 18, 3, 21, 14}
        };

        int count = countCommonInAllRows(arr, arr.length);
        System.out.println("Count of elements common in all rows: " + count);
    }

    private static int countCommonInAllRows(int[][] arr, int n) {
        Set<Integer> distinctSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            distinctSet.add(arr[0][i]);
        }

        for (int i = 1; i < n; i++) {
            Set<Integer> tempSet = new HashSet<>();
            for (int j = 0; j < arr[i].length; j++) {
                if (distinctSet.contains(arr[i][j])) {
                    tempSet.add(arr[i][j]);
                }
            }
            distinctSet = tempSet;
        }

        return distinctSet.size();
    }
}

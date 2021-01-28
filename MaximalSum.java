package com.company;

import java.util.*;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int row = input[0];
        int col = input[1];

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }

        int max = 0;
        int bestRow = 0;
        int bestCol = 0;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
                        + matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2]
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if(sum > max) {
                    max = sum;
                    bestRow = i;
                    bestCol = j;
                }
            }
        }
        System.out.println("Sum = " + max);
        System.out.println(matrix[bestRow][bestCol] + " " + matrix[bestRow][bestCol+1] + " " + matrix[bestRow][bestCol + 2]);
        System.out.println(matrix[bestRow+1][bestCol] + " " + matrix[bestRow+1][bestCol+1] + " " + matrix[bestRow+1][bestCol+2]);
        System.out.println(matrix[bestRow+2][bestCol] + " " + matrix[bestRow+2][bestCol+1] + " " + matrix[bestRow+2][bestCol+2]);
    }
}

package com.company;

import java.util.*;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        int[][] matrix2 = readMatrix(scanner);

        boolean equals = compare(matrix, matrix2);
        System.out.println(equals ? "equal" : "not equal");

    }

    private static boolean compare(int[][] matrix1 , int[][] matrix2) {

        if (matrix1.length != matrix2.length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }
        return matrix;
    }
}

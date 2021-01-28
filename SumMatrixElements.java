package com.company;

import java.util.*;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = readMatrix(scanner, row, col);
        int sum = 0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }

        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);

    }
    public static int[][] readMatrix(Scanner scanner, int row, int col){

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }
        return matrix;
    }
}

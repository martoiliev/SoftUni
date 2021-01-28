package com.company;

import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(n,scanner);
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j) {
                    sum1 += matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            sum2+= matrix[(matrix[i].length - 1) - i][i];
        }

        System.out.println(Math.abs(sum1 - sum2));
    }
    public static int[][] readMatrix(int n, Scanner scanner) {
        int[][] matrix = new int[n][];
        for (int i = 0; i < matrix.length; i++) {
                int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                matrix[i] = arr;
        }


        return matrix;
    }

}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] n = matrix(scanner);
        for (int[] ints : n) {
            System.out.print(Arrays.toString(ints) + " ");
        }

    }
    public static int[][] matrix(Scanner scanner) {
        String[] arr = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = array;

            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                System.out.println(num + " ");
            }
        }
        return matrix;
    }
}

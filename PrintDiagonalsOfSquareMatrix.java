package com.company;

import java.util.*;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][i] + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < matrix.length ; i++) {
                System.out.print(matrix[(matrix.length - 1) - i][i] + " " );
        }
    }
    public static int[][] readMatrix(Scanner scanner){
        int n = Integer.parseInt(scanner.nextLine());
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

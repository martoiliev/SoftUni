package com.company;

import java.util.*;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        char[][] matrix = matrix(scanner, row, col);
        char[][] matrix2 = matrix(scanner, row , col);

        char[][] c = new char[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == matrix2[i][j]) {
                    c[i][j] = matrix[i][j];
                } else {
                    c[i][j] = '*';
                }
            }
        }
        for (char[] chars : c) {
            System.out.println(Arrays.toString(chars).replaceAll("[\\[\\].,]","") + " ");
        }
    }

    public static char[][] matrix (Scanner scanner, int row, int col) {

        char[][] matrix = new char[row][col];
        for (int i = 0; i < row; i++) {
            String[] letter = scanner.nextLine().split("\\s+");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = letter[j].charAt(0);
            }
        }
        return matrix;
    }
}

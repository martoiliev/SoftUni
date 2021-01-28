package com.company;

import java.util.*;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][col];

        for (int i = 0; i < matrix.length; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[i] = arr;
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] tokens = command.split(" ");

            if (tokens[0].equals("swap")) {
                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);
                if (row1 < matrix.length && row2 < matrix.length) {
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            String current = matrix[i][j];
                            if (matrix[i][j].equals(matrix[row1][col1])) {
                                matrix[i][j] = matrix[row2][col2];
                                matrix[row2][col2] = current;
                                for (String[] strings : matrix) {
                                    System.out.println(Arrays.toString(strings).replaceAll("[\\[\\].,]", "") + " ");
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}
package com.company;

import java.util.*;

public class wrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }
        
        String[] numbers = scanner.nextLine().split("\\s+");
        int r = Integer.parseInt(numbers[0]);
        int c = Integer.parseInt(numbers[1]);
        int number = matrix[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == number) {
                    try {
                        if (number != matrix.length - 1 && matrix.length > 1
                                && i == 0 && matrix[i][j - 1] != number && matrix[i + 1][j] != number) {
                            matrix[i][j] = matrix[i][j - 1] + matrix[i + 1][j];
                        } else if (number != matrix.length - 1 && i > 0 && matrix[i][j + 1] != number &&
                                matrix[i + 1][j] != number && matrix[i - 1][j] != number) {
                            matrix[i][j] = matrix[i][j + 1] + matrix[i + 1][j] + matrix[i - 1][j];
                        } else {
                            matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                        }
                    }  catch (IndexOutOfBoundsException iox) {
                        iox.getCause();
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints).replaceAll("[\\[\\].,]", "") + " ");
        }
    }
}

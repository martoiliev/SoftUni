package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] y = readMatrix(scanner);
        int[][] x = readMatrix(scanner);

        boolean equal = compare(x,y);

        System.out.println(equal ? "true" : "not");

    }
    public static int[][] readMatrix(Scanner scanner){

        String[] array = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(array[0]);
        int col = Integer.parseInt(array[1]);

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[i] = arr;
        }
        return matrix;
    }

    public static boolean compare (int[][] x, int[][] y) {

        if (x.length != y.length) {
            return false;
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {

                if(x[i][j] != y[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}

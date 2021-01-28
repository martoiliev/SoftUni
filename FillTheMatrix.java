package com.company;

import java.util.*;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        int row = Integer.parseInt(input[0]);
        String pattern = input[1];
        
        int[][] matrix = new int[row][row];
        int current = 1;
        if(pattern.equals("A")) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = current;
                    current++;
                }
            }
        } else if (pattern.equals("B")) {
            for (int i = 0; i < matrix.length; i++) {
                if(i % 2 == 0) {
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[j][i] = current;
                        current++;
                    }
                } else {
                    for (int j = matrix.length - 1; j >=0  ; j--) {
                        matrix[j][i] = current;
                        current++;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints).replaceAll("[\\[\\].,]", "") + " ");
        }
    }
}

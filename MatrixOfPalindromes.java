package com.company;

import java.util.*;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        char a = 'a';
        char b = 'a';

        char[][] matrix = new char[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(a);
                System.out.print(b);
                System.out.print(a + " ");
                b++;
            }
            System.out.println();
            a++;
            b = a;
        }
    }
}

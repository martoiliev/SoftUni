package com.company;

public class FindTheSubMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {0,2,4,0,9,5},
                {7,1,3,3,2,1},
                {1,3,9,8,5,6},
                {4,6,7,9,1,0}
        };

        var max = 0;
        var row = 0;
        var col = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] +
                        matrix[i + 1][j] + matrix[i + 1][j + 1];

                if (sum > max) {
                    max = sum;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("The best platform is ");
        System.out.println(matrix[row][col] + " " +
                matrix[row][col + 1]);
        System.out.println(matrix[row + 1][col] + " " +
                matrix[row + 1][col + 1]);
        System.out.println("The sum is " + max);

    }
}

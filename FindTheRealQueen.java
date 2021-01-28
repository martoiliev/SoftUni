package com.company;

import java.util.*;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = 8;
        int col = 8;
        char[][] matrix = new char[row][col];

        for (int i = 0; i < matrix.length; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input[j].charAt(0);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'q') {
                    if(check(matrix,i,j)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }

    private static boolean check(char[][] matrix, int row, int elem) {

        for (int i = elem + 1; i < matrix[row].length ; i++) { // RightHorizontal
            if(matrix[row][i] == 'q') {
                return false;
            }
        }

        for (int i = elem - 1; i >= 0 ; i--) { // LeftHorizontal
            if (matrix[row][i] == 'q') {
                return false;
            }
        }

        for (int i = row + 1; i < matrix.length ; i++) { // DownVertical
            if (matrix[i][elem] == 'q') {
                return false;
            }
        }

        for (int i = row - 1; i >= 0 ; i--) { // UpVertical
            if (matrix[i][elem] == 'q'){
                return false;
            }
        }

        int upLeftDiagonal = elem - 1;

        for (int i = row - 1; i >=0 && upLeftDiagonal >= 0 ; i--, upLeftDiagonal--) { // UpLeftDiagonal
            if (matrix[i][upLeftDiagonal] == 'q') {
                return false;
            }
        }

        int upRightDiagonal = elem + 1;
        for (int i = row - 1; i >=0 && upRightDiagonal < matrix[i].length ; i--, upRightDiagonal++) { // UpRightDiagonal
            if (matrix[i][upRightDiagonal] == 'q') {
                return false;
            }
        }

        int downLeftDiagonal = elem - 1;

        for (int i = row + 1; i < matrix.length && downLeftDiagonal >= 0  ; i++, downLeftDiagonal--) { // DownLeftDiagonal
            if (matrix[i][downLeftDiagonal] == 'q') {
                return false;
            }
        }

        int downRightDiagonal = elem + 1;

        for (int i = row + 1; i < matrix.length && downRightDiagonal < matrix[i].length  ; i++, downRightDiagonal++) { //DownRightDiagonal
            if(matrix[i][downRightDiagonal] =='q') {
                return false;
            }
        }

        return true;
    }
}
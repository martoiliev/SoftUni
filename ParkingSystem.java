package com.company;

import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = new int[row][col];

        String command = scanner.nextLine();

        while (!command.equals("stop")) {
            String[] tokens = command.split("\\s+");
            int z = Integer.parseInt(tokens[0]);
            int x = Integer.parseInt(tokens[1]);
            int y = Integer.parseInt(tokens[2]);


            if (x <= matrix.length && y <= matrix[0].length && z <= matrix.length) {
                for (int i = 1; i < matrix.length; i++) {
                    int steps = 0;
                    for (int j = 1; j < matrix[i].length - 1; j++) {
                        steps = x +y;
                        if (matrix[i][j] == -1) {
                             matrix[i][j] = matrix[x][y];
                        } else if (matrix[i][j] != -1 && matrix[i][j+1] == -1) {
                            matrix[i][j+1] = matrix[x][y];
                        } else if (matrix[i][j] == -1 && matrix[i][j+1] == -1) {
                            matrix[i][j] = matrix[x][y];
                        } else {
                            System.out.println("Row " + i + " full");
                        }
                    }
                    System.out.println(steps);
                }
            }
            command = scanner.nextLine();
        }
    }
}

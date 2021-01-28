package com.company;

import java.util.*;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimension = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);

        int current = 1;
        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                matrix.get(i).add(current);
                current++;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int r = Integer.parseInt(tokens[2]);

            for (int i = row - r; i <= row + r ; i++) {
                if (range(i, col, matrix) && i != row) {
                    matrix.get(i).remove(col);
                }
            }

            for (int i = col + r; i >= col - r ; i--) {
                if (range(row, i,matrix)) {
                    matrix.get(row).remove(i);
                }
            }
            matrix.removeIf(List::isEmpty);
            command = scanner.nextLine();
        }

        for (List<Integer> list : matrix) {
            System.out.println(list.toString().replaceAll("[\\[\\].,]", "") + " ");
        }
    }
    public static boolean range(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >=0 && col < matrix.get(row).size();
    }
}


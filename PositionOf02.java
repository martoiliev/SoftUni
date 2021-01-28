package com.company;

import java.util.*;

public class PositionOf02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            array[i] = arr;
        }

        List<int[]> list = new ArrayList<>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int n = array[i][j];
                if (n == number) {
                    list.add(new int[]{i,j});
                }
            }
        }
        if (!list.isEmpty()) {
            for (int[] ints : list) {
                System.out.println(Arrays.toString(ints).replaceAll("[\\[\\].,]", ""));
            }
        } else {
            System.out.println("not found");
        }
    }
}

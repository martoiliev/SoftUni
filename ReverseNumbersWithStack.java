package com.company;

import java.util.*;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int j : array) {

            stack.push(j);
        }
        System.out.println(stack.toString().replaceAll("[\\[\\].,]", ""));
    }
}

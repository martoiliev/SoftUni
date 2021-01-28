package com.company;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Collections.addAll(set, input);

        }
        for (String s : set) {
            System.out.print(s + " ");
        }
    }
}

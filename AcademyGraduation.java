package com.company;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] score = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double total = 0;
            for (double v : score) {
                total += v;
            }
            double average=  total / score.length;
            map.putIfAbsent(name, average);
        }

        map.forEach((k,v)-> System.out.printf("%s is graduated with %f%n",k,v));
    }
}

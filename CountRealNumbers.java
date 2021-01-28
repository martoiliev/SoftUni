package com.company;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < arr.length; i++) {
            double n = arr[i];
            int times = 0;
            for (int j = 0; j < arr.length; j++) {
                if (n == arr[j]) {
                    times++;
                    map.put(n, times);
                }
            }
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

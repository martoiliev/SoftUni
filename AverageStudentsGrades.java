package com.company;

import java.util.*;

public class AverageStudentsGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] students = scanner.nextLine().split("\\s+");
            String name = students[0];
            double grade = Double.parseDouble(students[1]);

            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<>());
            }
            map.get(name).add(grade);
        }


        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double total = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                total += entry.getValue().get(i);
            }
            System.out.printf("%s -> ", entry.getKey());
            entry.getValue().forEach(e-> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)", total / entry.getValue().size());
            System.out.println();
        }

    }
}

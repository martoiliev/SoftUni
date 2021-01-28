package com.company;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,HashSet<String>> map = new TreeMap<>();
        Map<String, Integer> time = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String ip = input[0];
            String name = input[1];
            int duration = Integer.parseInt(input[2]);


            map.putIfAbsent(name, new HashSet<>());
            time.putIfAbsent(name, duration);
            map.get(name).add(ip);

            if(map.get(name).contains(ip)) {
                map.remove(ip);
            }

        }
        map.forEach((k,v)-> System.out.println(k + ": " + String.join(", ", v)));
    }
}

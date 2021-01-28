package com.company;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String continent = command[0];
            String country = command[1];
            String city = command[2];

            map.putIfAbsent(continent, new LinkedHashMap<>());
            map.get(continent).putIfAbsent(country, new ArrayList<>());
            map.get(continent).get(country).add(city);
        }

        map.forEach((k,v) -> {
            System.out.printf("%s:%n", k);
            v.forEach((key1, value) -> {
                System.out.printf("%s -> ", key1);
                System.out.println(String.join(", ", value));
            });
        });
    }
}

package com.company;

import java.util.*;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Map<String, Integer> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            input = scanner.nextLine();

            if (!input.equals("stop")) {
                int quantity = Integer.parseInt(scanner.nextLine());
                if (!map.containsKey(input)) {
                    map.put(input, quantity);
                } else {
                    int v = map.get(input);
                    map.put(input, v + quantity);
                }
            }
        }
        map.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}

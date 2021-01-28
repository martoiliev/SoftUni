package com.company;

import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        Map<String, String> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            input = scanner.nextLine();

            if (!input.equals("stop")) {
                String email = scanner.nextLine();
                map.putIfAbsent(input, email);
                if (map.get(input).endsWith("com") || map.get(input).endsWith("us")
                        || map.get(input).endsWith("uk")) {
                    map.remove(input);
                }
            }
        }
        map.forEach((k, v) -> System.out.printf("%s -> %s%n", k, v));
    }
}

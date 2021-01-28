package com.company;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        while (!input.equals("end")) {
            String ip = input.split("=")[1];
            String ipAddress = ip.split(" ")[0];
            String name = input.split("=")[3];

            map.putIfAbsent(name, new LinkedHashMap<>());
            map.get(name).putIfAbsent(ipAddress, 0);
            int count = map.get(name).get(ipAddress) + 1;
            map.get(name).put(ipAddress, count);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : map.entrySet()) {
            List<String> ipRow = new ArrayList<>();
            System.out.printf("%s:%n", user.getKey());
            for (Map.Entry<String, Integer> entry : user.getValue().entrySet()) {
                ipRow.add(entry.getKey() + " => " + entry.getValue());
            }
            System.out.print(String.join(", ", ipRow));
            if (ipRow.size() > 0) {
                System.out.println(".");
            }
        }
    }
}
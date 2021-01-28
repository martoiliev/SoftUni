package com.company;

import java.util.*;

public class SrubskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();

        while (!input.equals("End")) {
            if (!input.contains("@") || input.charAt(input.indexOf("@") - 1) != ' ') {
                input = scanner.nextLine();
                continue;
            }
            String name = input.substring(0, input.indexOf("@") - 1);
            int venueIndex = 0;
            for (int i = input.indexOf("@"); i < input.length() ; i++) {
                char c = input.charAt(i);
                if (Character.isDigit(c) && input.charAt(i - 1) == ' '){
                    venueIndex = i;
                    break;
                }
            }

            String venue = input.substring(input.indexOf("@") + 1, venueIndex - 1);
            String number = input.substring(venueIndex);
            int ticketPrice = Integer.parseInt(number.split(" ")[0]);
            int countTickets = Integer.parseInt(number.split(" ")[1]);

            if (!map.containsKey(venue)) {
                Map<String, Integer> singers = new LinkedHashMap<>();
                singers.put(name, ticketPrice * countTickets);
                map.put(venue, singers);
            } else {
                Map<String, Integer> current = map.get(venue);
                if (current.containsKey(name)) {
                    current.put(name, current.get(name) + ticketPrice * countTickets);
                } else {
                    current.put(name, ticketPrice * countTickets);
                }
            }


            input = scanner.nextLine();
        }
        for (String string : map.keySet()) {
            System.out.println(string);

            Map<String, Integer> singers = map.get(string);
            singers.entrySet()
                    .stream()
                    .sorted((s1,s2)-> s2.getValue().compareTo(s1.getValue()))
                    .forEach(s -> System.out.printf("#  %s -> %d%n",s.getKey(), s.getValue()));
        }
    }
}

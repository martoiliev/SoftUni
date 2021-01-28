package com.company;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // J -> 11, Q -> 12, K -> 13, A -> 14 --- This are the points
        // S -> 4, H -> 3, D -> 2, C -> 1 --- This are the multipliers

       String input = scanner.nextLine();
       Map<String, Set<String>> map = new LinkedHashMap<>();
       while (!input.equals("JOKER")) {
           String name = input.split(":")[0];
           String[] cards = input.split(": ")[1].split(", ");
           Set<String> deck = new HashSet<>(Arrays.asList(cards));

           if (!map.containsKey(name)) {
               map.put(name, deck);
           } else {
               Set<String> currentCards = map.get(name);
               currentCards.addAll(deck);
               map.put(name, currentCards);
           }

           input = scanner.nextLine();
       }

        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            int points = calculate(entry.getValue());
            System.out.printf("%s: %d%n", entry.getKey(), points);
        }
    }
    public static HashMap<Character, Integer> getPower() {
        HashMap<Character, Integer> powers = new HashMap<>();
        powers.put('1', 1);
        powers.put('2', 2);
        powers.put('3', 3);
        powers.put('4', 4);
        powers.put('5', 5);
        powers.put('6', 6);
        powers.put('7', 7);
        powers.put('8', 8);
        powers.put('9', 9);
        powers.put('J', 11);
        powers.put('Q', 12);
        powers.put('K', 13);
        powers.put('A', 14);
        powers.put('S', 4);
        powers.put('H', 3);
        powers.put('D', 2);
        powers.put('C', 1);

        return powers;
    }
    public static int calculate(Set<String> cards) {
        int sum = 0;
        Map<Character, Integer> map = getPower();
        for (String card : cards) {
            if (card.contains("10")) {
                sum += 10 * map.get(card.charAt(2));
                continue;
            }
            char first = card.charAt(0);
            char second = card.charAt(1);
            sum += map.get(first) * map.get(second);
        }
        return sum;
    }
}

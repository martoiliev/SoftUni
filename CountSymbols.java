package com.company;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            map.putIfAbsent(c, 0);
            map.put(c,map.get(c) + 1);
        }
        map.forEach((key,value)-> System.out.printf("%c: %d time/s%n",key,value));
    }
}

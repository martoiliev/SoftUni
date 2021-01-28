package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race02Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer>map = new LinkedHashMap<>();
        String[] participants = scanner.nextLine().split(", ");

        for (int i = 0; i < participants.length; i++) {
            map.putIfAbsent(participants[i],0);
        }
        String input = scanner.nextLine();

        while (!input.equals("end of race")){
            String name = "";
            int distance = 0;

            Pattern names = Pattern.compile("[A-Z-a-z]");
            Matcher namesM = names.matcher(input);
            while (namesM.find()){
                name += namesM.group();
            }

            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                distance += Integer.parseInt(matcher.group());
            }

            if (map.containsKey(name)){
                map.put(name, map.get(name) + distance);
            }
            input = scanner.nextLine();
        }

        List<String> list = new ArrayList<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3)
                .forEach(x -> list.add(x.getKey()));

        System.out.printf("1st place: %s%n" +
                "2nd place: %s%n" +
                "3rd place: %s%n" , list.get(0), list.get(1),list.get(2));
    }
}

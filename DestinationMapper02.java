package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(=|\\/)(?<word>[A-Z][A-Za-z]{2,})\\1";
        List<String> destinations = new ArrayList<>();
        int sum  = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            destinations.add(matcher.group("word"));
        }

        if (destinations.size() <= 0) {
            System.out.println("Destinations:");
            System.out.println("Travel points: 0");
        } else {
            for (String s : destinations) {
                sum += s.length();
            }
            System.out.println("Destinations: ");
            for (String i : destinations) {
                System.out.print(i + ", ");
            }
            System.out.println();
            System.out.printf("Travel points: %d", sum);
        }
    }
}

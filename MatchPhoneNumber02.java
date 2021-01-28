package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "\\+359([ -])2\\1\\d{3}[ -]\\d{4}\\b";
        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            list.add(matcher.group());
        }
        System.out.print(String.join(", ", list));

    }
}

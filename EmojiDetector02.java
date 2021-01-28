package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";
        String numRegex = "\\d";
        int sum = 1;

        List<String> emojis = new ArrayList<>();
        List<String> validEmojis = new ArrayList<>();

        Pattern numPattern = Pattern.compile(numRegex);
        Matcher numMatcher = numPattern.matcher(input);
        while (numMatcher.find()){
            int digit = Integer.parseInt(numMatcher.group(0));
            sum = sum * digit;
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String s = matcher.group("name");

            int sumEmoji = 0;
            for (int i = 2; i < s.length() - 2; i++) {
                char c = s.charAt(i);
                sumEmoji = sumEmoji + (int)c;
            }
            emojis.add(s);

            if (sumEmoji > sum) {
                validEmojis.add(s);
            }
        }

        System.out.println("Cool threshold: " + sum);
        System.out.println(emojis.size() + " emojis found in the text. The cool ones are:");

        for (String s : validEmojis) {
            System.out.printf("%s%n", s);
        }


    }
}

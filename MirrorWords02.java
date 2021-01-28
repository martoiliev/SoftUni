    package com.company;

    import java.util.*;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class MirrorWords02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String>list = new ArrayList<>();

            String input = scanner.nextLine();
            String regex = "(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
            int pairs = 0;
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                pairs++;
                String first = matcher.group("first");
                String second = new StringBuilder(matcher.group("second")).reverse().toString();

                if (first.equals(second)){
                    list.add(first + " <=> " + matcher.group("second"));
                }
            }
            if (pairs == 0) {
                System.out.println("No word pairs found!");
            } else {
                System.out.printf("%d word pairs found!%n", pairs);
            }

            if (list.size() <= 0) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                System.out.print(String.join(", ", list));
            }
        }
    }

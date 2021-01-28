package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String regex = "^U\\$([A-Z][a-z]{2,})U\\$P@\\$([a-z]{5,}[0-9]+)P@\\$$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                count++;
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n", matcher.group(1)
                , matcher.group(2));
            } else {
                System.out.println("Invalid username or password");
            }
        }
            System.out.println("Successful registrations: " + count);

    }
}


package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome03Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "^%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+(\\.[0-9]+)?)\\$$";
        double total = 0;
        while (!input.equals("end of shift")){

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                double quantity = Double.parseDouble(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                total +=  quantity * price;
                System.out.printf("%s: %s - %.2f%n", name,product,quantity * price);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", total);
    }
}

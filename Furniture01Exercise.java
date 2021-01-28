package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double cost = 0;
        List<String>list = new ArrayList<>();
        Pattern pattern = Pattern.compile(">>(?<product>[A-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)");

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                list.add(name);

                cost += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String p : list) {
            System.out.println(p);
        }
        System.out.printf("Total money spend: %.2f", cost);

    }
}

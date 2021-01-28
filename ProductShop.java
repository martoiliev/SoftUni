package com.company;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,Map<String,Double>> map = new TreeMap<>();

        while (!input.equals("Revision")) {
        String[] command = input.split(", ");
        String shop = command[0];
        String product = command[1];
        double price = Double.parseDouble(command[2]);

        if(!map.containsKey(shop)) {
            map.put(shop, new LinkedHashMap<>());
        }
        map.get(shop).put(product, price);

            input = scanner.nextLine();
        }

       map.forEach((k,v) ->{
           System.out.printf("%s ->%n", k);
           v.forEach((key, value)-> System.out.printf("Product: %s, Price: %.1f%n", key, value));
       });
    }
}

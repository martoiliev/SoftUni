package com.company;

import java.util.*;

public class Problem1New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unLiked = 0;
        TreeMap<String, List<String>> listMap = new TreeMap<>();

        List<String> dishes;



        String input = sc.nextLine();

        while (!"Stop".equals(input)){
            String[] token = input.split("-");
            String likeUnlike = token[0];
            String name = token[1];
            String dish = token[2];

            if (likeUnlike.equals("Like")){

                if (listMap.containsKey(name)){
                    if (!listMap.get(name).contains(dish)){
                        listMap.get(name).add(dish);
                    }
                }else {
                    dishes=new ArrayList<>();
                    dishes.add(dish);
                    listMap.put(name,dishes);
                }

            }else if (likeUnlike.equals("Unlike")){
                if (!listMap.containsKey(name)){
                    System.out.printf("%s is not at the party.%n",name);
                } else if (!listMap.get(name).contains(dish)){
                    System.out.printf("%s doesn't have the %s in his/her collection.%n", name,dish);
                }else  {
                    unLiked++;
                    listMap.get(name).remove(dish);
                    System.out.printf("%s doesn't like the %s.%n",name,dish);

                }
            }


            input= sc.nextLine();
        }

        listMap.entrySet().stream()
                .sorted(Map.Entry.<String, List<String>>comparingByValue(Comparator.comparing(List::size))
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> {
                    System.out.printf("%s: ", e.getKey());
                    String meals = String.join(", ", e.getValue());
                    System.out.println(meals);
                });

        System.out.printf("Unliked meals: %d", unLiked);
    }
}
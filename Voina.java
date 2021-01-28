package com.company;

import java.util.*;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] second = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        HashSet<Integer> playerOne = new HashSet<>();
        HashSet<Integer> playerTwo = new HashSet<>();

        for (int i = 0; i < first.length; i++) {
            if (first[i] > second[i]) {
                playerOne.add(second[i]);
                playerTwo.remove(second[i]);
            } else {
                playerTwo.add(first[i]);
                playerOne.remove(first[i]);
            }
        }

        if (playerOne.size() > playerTwo.size()) {
            System.out.println("Player One Win");
        } else {
            System.out.println("Player Two Win");
        }

        if (playerOne.size() == playerTwo.size()) {
            System.out.println("Draw");
        }
    }
}

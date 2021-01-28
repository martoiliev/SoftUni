package com.company;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> vip = new ArrayList<>();
        List<String> regular = new ArrayList<>();

        while (!input.equals("PARTY")) {
            String guest = input;
            char ch = guest.charAt(0);

            if(Character.isDigit(ch)) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }

            input = scanner.nextLine();
        }

        String end = scanner.nextLine();
        while (!end.equals("END")) {
            String guest = end;
            vip.remove(guest);
            regular.remove(guest);
            end = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        for (String s : vip) {
            System.out.println(s);
        }
        for (String s : regular) {
            System.out.println(s);
        }
    }
}

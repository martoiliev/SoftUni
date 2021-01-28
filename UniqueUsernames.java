package com.company;

import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> set = new LinkedHashSet<>();


        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            set.add(name);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}

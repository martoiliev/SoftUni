package com.company;

import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String current = "";
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    current = stack.pop();
                    System.out.println(current);
                }
            }  else {
                stack.push(current);
                current = input;
                System.out.println(current);
            }
            input = scanner.nextLine();
        }
    }
}

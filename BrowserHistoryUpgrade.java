package com.company;

import java.util.*;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if(input.equals("back")) {
                if (!back.isEmpty()) {
                    forward.addFirst(back.peek());
                    back.pop();
                    System.out.println(back.peek());
                } else {
                    System.out.println("no previous URLs");
                }

            } else if (input.equals("forward")) {

                if(forward.isEmpty()){
                    System.out.println("no next URLs");
                } else {
                    System.out.println(forward.peek());
                    back.push(forward.pop());
                }
            } else {
                System.out.println(input);
                back.push(input);
                forward.clear();

            }

            input = scanner.nextLine();
        }
    }
}

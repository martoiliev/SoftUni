package com.company;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\s+");

        int sum = Integer.parseInt(command[0]);
        for (int i = 0; i < command.length - 1; i++) {
            if (command[i].equals("+")) {
                sum += Integer.parseInt(command[i + 1]);
            } else if (command[i].equals("-")){
                sum -= Integer.parseInt(command[i + 1]);
            }
        }
        System.out.println(sum);
    }
}

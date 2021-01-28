package com.company;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String plate = input;
            String[] command = plate.split(", ");

            if(command[0].equals("IN")) {
                cars.add(command[1]);
            } else {
                cars.remove(command[1]);
            }

            input = scanner.nextLine();
        }
        if (!cars.isEmpty()) {
            for (String car : cars) {
                System.out.println(car);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}

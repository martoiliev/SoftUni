package com.company;

import java.util.*;

public class ActivationKeys01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String[] input = scanner.nextLine().split(">>>");

        while (!input[0].equals("Generate")) {

            switch (input[0]){

                case "Contains":
                    if(activationKey.contains(input[1])) {
                        System.out.println(activationKey + " contains " + input[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String comm = input[1];
                    int index1 = Integer.parseInt(input[2]);
                    int index2 = Integer.parseInt(input[3]);
                    String changes = activationKey.substring(index1,index2);
                    switch (comm) {
                        case "Upper":
                        changes = changes.toUpperCase();
                        StringBuilder sb = new StringBuilder();
                        sb.append(activationKey);
                        sb.replace(index1,index2, (changes));
                        activationKey = sb.toString();
                            break;
                        case "Lower":
                        changes = changes.toLowerCase();
                        StringBuilder lower = new StringBuilder();
                        lower.append(activationKey);
                        lower.replace(index1,index2,(changes));
                        activationKey = lower.toString();
                            break;
                        }
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    int x = Integer.parseInt(input[1]);
                    int y = Integer.parseInt(input[2]);
                    String str = activationKey.substring(x,y);
                    activationKey = activationKey.replaceAll(str,"");
                    System.out.println(activationKey);
                    break;
            }
            input = scanner.nextLine().split(">>>");
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}

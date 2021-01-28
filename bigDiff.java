package com.company;

import java.util.Arrays;

public class bigDiff {
    public static void main(String[] args) {

        int[] arr = new int[]{10,3,5,6};

        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}

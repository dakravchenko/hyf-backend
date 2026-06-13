package com.week1and2.utils;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 11, 12, 55 };

        System.out.println(NumberUtils.average(numbers));

        System.out.println(NumberUtils.clamp(11, 12, 55));

    }
}

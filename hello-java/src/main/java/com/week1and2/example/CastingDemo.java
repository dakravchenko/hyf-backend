package com.week1and2.example;

public class CastingDemo {
    public static void main(String[] args) {
        double a = 7.9;
        int b = (int) a;
        System.out.println(b);

        int max = Integer.MAX_VALUE;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(max + 1);

        double result = 0.1 + 0.2;
        System.out.println(result);
        System.out.println(result == 0.3);
    }
}
package com.week1and2.example;

import java.util.Scanner;

/*### Exercise 6.5 — Coding: Input Validation Loop

Write a program that uses `Scanner` to ask the user for a number between 1 and 100. Keep asking until a valid number is entered. Once valid, print:

- Whether it is odd or even
- Whether it is a multiple of 5
- Its square */
public class Exercise7 {

    public static String evenOrOdd(int n) {
        if (n % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static boolean devidedByNumber(int n, int devider) {
        if (n % devider == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSquare(int n) {
        for (int i = 1; i < n / 2 + 1; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = 0;

        do {
            System.out.println("number please");
            number = s.nextInt();
        } while (number < 1 || number > 100);

        System.out.println(evenOrOdd(number));
        System.out.println(devidedByNumber(number, 5));
        System.out.println(isSquare(number));

        s.close();

    }

}

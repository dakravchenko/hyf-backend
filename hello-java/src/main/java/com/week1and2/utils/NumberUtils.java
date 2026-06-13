package com.week1and2.utils;

/*### Exercise 6.3 — Coding: Number Classifier

Write a method `classify(int n)` that returns a `String` describing the number:

- `"zero"` if n is 0
- `"positive even"` if n is positive and even
- `"positive odd"` if n is positive and odd
- `"negative"` if n is negative

Call it from `main` with at least five different inputs and print each result. */

public class NumberUtils {

    public NumberUtils() {
    }

    public static String classify(int n) {
        if (n == 0) {
            return "Zero";
        } else if (n > 0) {
            if (n % 2 == 0) {
                return "positive odd";
            } else {
                return "positive even";
            }
        } else {
            return "negative";
        }
    }

    public static int clamp(int value, int min, int max) {
        if (value < max && value < min) {
            return value;
        } else if (value > max) {
            return max;
        } else {
            return min;
        }
    }

    public static double average(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}

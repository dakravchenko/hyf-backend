package com.week3.swap;

import java.util.ArrayList;
import java.util.List;

public class SwapExercise {
    // Generic, static swap method using List.set (efficient and idiomatic)
    public static <T> void swap(List<T> list, int index1, int index2) {
        if (index1 == index2) return; // nothing to do
        T tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }

    // Convenience method to assert the equality of two strings and fail the program if they are not equal.
    private static void manualAssertString(String str, String equalTo) {
        if (!str.equals(equalTo)) {
            throw new AssertionError("String " + str + " does not equal " + equalTo);
        }
    }

    // Standard Java entry point
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Hack", "Your", "Future"));

        swap(names, 0, 2);
        manualAssertString(names.get(0), "Future");
        swap(names, 1, 0);
        manualAssertString(names.get(0), "Your");

        // If code execution reaches here, the swap method is working as expected.
        System.out.println("Method swap works as expected!");
    }
}
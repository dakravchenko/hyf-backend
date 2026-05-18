package com.example;

import java.util.Arrays;

public class Exercise2 {

    int[] grades = { 78, 92, 65, 88, 71, 95, 83 };

    public static int findSum(int[] grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum;

    }

    public static double findAverage(int[] grades) {
        double sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        double average = sum / grades.length;

        return Math.round(average * 100.0) / 100.0;
    }

    public static int findMax(int[] numbers) {
        int max = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // String[] foods = { "sushi", "pizza", "rice", "salman", "pao de queijo" };

        // for (int i = 0; i < foods.length; i++) {
        // System.out.println(i + "" + foods[i]);
        // }

        // for (String food : foods) {
        // System.out.println(food);

        // }

        int[] grades = { 78, 92, 65, 88, 71, 95, 83 };

        int[] numbers = {34, 7, 89, 12, 56, 2};

        int[] temps = {18, 4, 27, -2, 13, 31, 9};

        System.out.println(findSum(grades));
        System.out.println(findAverage(grades));
        System.out.println(findMax(numbers));

        System.out.println(Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println(Arrays.toString(temps));

/*## ✏️ Exercise — Build a CLI Personal Profile Card

Put everything in this module together to build a small interactive CLI program.

### What it should do

1. Greet the user and ask for the following inputs — in this order:
    - Full name (`String`)
    - Age (`int`)
    - City (`String`)
    - Hourly rate in euros (`double`)
    - Hours worked this month (`int`)
2. Calculate:
    - Monthly earnings = hourly rate × hours worked
3. Print a formatted profile card that looks exactly like this (values will vary):

```
╔══════════════════════════════════════╗
         PERSONAL PROFILE CARD
╚══════════════════════════════════════╝
  Name        : Alice van der Berg
  Age         : 31
  City        : Amsterdam
  Rate        : €22.50 / hr
  Hours       : 160 hrs
  Monthly Pay : €3,600.00
══════════════════════════════════════

### Requirements

- Use `printf` with format specifiers for the profile card output
- Handle the `Scanner` newline quirk correctly (city comes after age)
- The monthly pay must be formatted with 2 decimal places

### Bonus Challenge

Add input validation: if the user enters an age below 0 or above 120, print an error message and ask again. Hint: you'll need a loop from Module 4 — Control Flow.
``` */


    }
}

package com.week1and2.example;

import java.util.Scanner;

public class Exercise4 {

    public char getGrade(int score) {
        return switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            case 5, 4, 3, 2, 1 -> 'F';
            default -> throw new IllegalArgumentException("Invalid score: " + score);

        };
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;

            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.println("enter your age");
        // int age = s.nextInt();
        // s.nextLine();
        // System.out.println("enter your Income");
        // double income = s.nextDouble();

        // if (age >= 18 && age <= 65 && income >= 1000) {
        // System.out.println("Eligible");
        // } else {
        // System.out.println("not Eligible");
        // }

        // s.close();

        // for (int i = 1; i <= 5; i++) {
        // System.out.println("Line " + i + "for");
        // }

        // int number = 0;
        // while (number < 5) {

        // System.out.println("Line " + (number + 1) + "while");
        // number++;
        // }

        // int score = 0;

        // do {
        // System.out.println("Line " + (score + 1) + "do");
        // score++;
        // } while (score < 5);

        // for(int a = 1; a <= 5; a ++){
        // for(int b = 1; b<= a; b++){
        // System.out.print(b);
        // }
        // System.out.println();

        // }

        for (int i = 2; i <= 50; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime == true) {
                System.out.println(i);
                continue;
            }
        }

    }
}

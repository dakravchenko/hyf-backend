package com.week1and2.example;

public class Exercise1 {
    public static void main(String[] args) {
        String name = "Daniil";
        int age = 30;
        double height = 1.78;
        boolean isCoffeeLover = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Is Coffee Lover: " + isCoffeeLover);

        double score = 87.96;
        int roundedScore = (int) Math.round(score);
        System.out.println(roundedScore);
        
    }
}

package com.hyfacademy.util;

public class GradeUtils {
    private GradeUtils() {
    }

    public static final int MODULE_PASS_MARK = 55;
    public static final double TRACK_PASS_AVERAGE = 60.0;
    public static final int MODULE_COUNT = 5;
    public static final String[] MODULE_NAMES = { "Java Basics", "Control Flow", "OOP Fundamentals",
            "Arrays & Collections", "Input & Output" };

    public static double calculateAverage(int[] grades) {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static boolean isPassing(double average) {
        return average >= TRACK_PASS_AVERAGE;
    }

    public static boolean isModulePassing(int grade) {
        return grade >= MODULE_PASS_MARK;
    }

    public static String getLetterGrade(double average) {
        String grade = switch ((int) (average / 10)) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6, 5, 4, 3, 2, 1, 0 -> "F";
            default -> "INVALID";

        };
        return grade;
    }

    public static String formatGrade(double average) {
        return String.format("%3.0f", average);
    }
}
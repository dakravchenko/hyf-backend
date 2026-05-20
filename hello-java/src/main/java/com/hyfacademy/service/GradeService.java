package com.hyfacademy.service;

import java.util.Scanner;

import com.hyfacademy.model.Student;
import com.hyfacademy.util.GradeUtils;

public class GradeService {

    private static final int MAX_STUDENTS = 20;
    private Student[] students = new Student[MAX_STUDENTS];
    private int studentCount;
    private Scanner scanner = new Scanner(System.in);

    private String startingMessage = """
            ╔══════════════════════════════════════╗
            ║         HYF ACADEMY — GRADE MGR      ║
            ╚══════════════════════════════════════╝
              1. Add student
              2. Enter grades
              3. View all students
              4. View student report
              5. Exit
            ══════════════════════════════════════
            Choose an option:
            """;

    public void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("maximum number of students achieved");
            return;
        } else {
            System.out.println("enter a student's name");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("student name cannot be empty");
                return;
            }

            Student student = new Student(name, String.format("HYF-%03d", studentCount + 1));
            students[studentCount] = student;
            studentCount++;
            return;
        }
    }

    public void enterGrades() {
        System.out.println("select student's id");
        String id = scanner.nextLine().trim();
        Student selectedStudent = findStudentById(id);

        if (selectedStudent == null) {
            System.out.println("there is no such a student");
            return;
        } else {
            for (int i = 0; i < GradeUtils.MODULE_COUNT; i++) {
                int score;

                while (true) {
                    System.out.printf("Enter score for module: %s%n", GradeUtils.MODULE_NAMES[i]);

                    if (!scanner.hasNextInt()) {
                        System.out.println("invalid input, please enter a number between 0 and 100");
                        scanner.nextLine();
                        continue;
                    }

                    score = scanner.nextInt();
                    scanner.nextLine();

                    if (score < 0 || score > 100) {
                        System.out.println("invalid grade, please enter a value between 0 and 100");
                        continue;
                    }

                    break;
                }

                selectedStudent.setGrade(i, score);
            }
            return;
        }
    }

    private Student findStudentById(String id) {
        String trimmedId = id.trim();

        for (Student student : students) {
            if (student == null) {
                break;
            }
            if (student.getStudentId().trim().equalsIgnoreCase(trimmedId)) {
                return student;
            }
        }
        return null;
    }

    public void viewStudentReport() {
        System.out.println("select student's id");
        String id = scanner.nextLine().trim();
        Student selectedStudent = findStudentById(id);

        if (selectedStudent == null) {
            System.out.println("there is no such a student");
            return;
        } else {
            double average = GradeUtils.calculateAverage(selectedStudent.getGrades());
            System.out.printf("STUDENT REPORT%n");
            System.out.printf("id: %s%n", selectedStudent.getStudentId());
            System.out.printf("name: %s%n", selectedStudent.getName());
            System.out.printf("MODULE GRADES%n");
            for (int i = 0; i < GradeUtils.MODULE_COUNT; i++) {
                boolean result = GradeUtils.isModulePassing(selectedStudent.getGrades()[i]);
                System.out.printf("%s : %d   %s%n", GradeUtils.MODULE_NAMES[i], selectedStudent.getGrades()[i],
                        result ? "PASS" : "FAIL");
            }
            System.out.printf("Average: %.2f%n", average);
            System.out.printf("Grade: %s%n", GradeUtils.getLetterGrade(average));
            System.out.printf("Status : %s%n", GradeUtils.isPassing(average) ? "PASS" : "FAIL");
            return;
        }
    }

    public void viewAllStudents() {
        if (studentCount == 0) {
            System.out.println("No students added");
            return;
        } else {
            System.out.println("ID         NAME                 AVERAGE   GRADE   STATUS");
            int countPass = 0;
            for (Student student : students) {
                if (student == null) {
                    break;
                }
                double average = GradeUtils.calculateAverage(student.getGrades());
                if (GradeUtils.isPassing(average)) {
                    countPass++;
                }

                System.out.println(student.toString());
            }
            System.out.printf("Total students: %d Passing: %d   Failing: %d%n", studentCount, countPass,
                    studentCount - countPass);
            return;
        }
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println(startingMessage);

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine();
                continue;
            }

            int number = scanner.nextInt();
            scanner.nextLine();

            switch (number) {
                case 1 -> addStudent();

                case 2 -> enterGrades();

                case 3 -> viewAllStudents();

                case 4 -> viewStudentReport();

                case 5 -> {
                    System.out.println("Exiting application...");
                    running = false;
                }

                default -> System.out.println("Invalid option. Choose between 1 and 5.");
            }
        }
    }
}
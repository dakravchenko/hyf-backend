package com.hyfacademy.model;

import com.hyfacademy.util.GradeUtils;

public class Student {
    private String name;
    private String studentId;
    private int[] grades = new int[5];

    private static int totalStudents;

    public Student(String name, String studentId) {
        this.name = name.trim();
        this.studentId = studentId.trim();
        this.grades = new int[] { 0, 0, 0, 0, 0 };
        totalStudents++;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public int[] getGrades() {
        return this.grades;
    }

    public void setGrade(int moduleIndex, int grade) {
        if (moduleIndex < 0 || moduleIndex > 4 || grade < 0 || grade > 100) {
            System.out.println("invalid index or grade");
        } else {
            this.grades[moduleIndex] = grade;
        }
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    @Override
    public String toString() {
        double average = GradeUtils.calculateAverage(this.getGrades());
        return String.format("[%s]  %s  %.2f   %s    %s", this.getStudentId(), this.getName(), average,
                GradeUtils.formatGrade(average), GradeUtils.isPassing(average) ? "PASS" : "FAIL");
    }
}
package com.school.model;

public class Student {
    private String studentId;
    private int[] grades;

    public Student(String studentId, int moduleCount) {
        this.studentId = studentId;
        this.grades = new int[moduleCount];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = -1; // not graded yet
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public int[] getGrades() {
        return grades;
    }

    public int getGrade(int moduleIndex) {
        return grades[moduleIndex];
    }

    public void setGrade(int moduleIndex, int grade) {
        grades[moduleIndex] = grade;
    }
}
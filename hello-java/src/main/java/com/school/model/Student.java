package com.school.model;

public class Student {
    private String name;
    private int studentId;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.studentId = id;
        this.gpa = gpa;

    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }
}

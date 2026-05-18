package com.school.model;

public class StudentGrade {
    private String studentName;
    private int grade;

    private void setStudentName(String name) {
        if (name != null && !name.equals("")) {
            this.studentName = name;
        } else {
            System.out.println("error");
        }
    }

    private void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("error");
        } else {
            this.grade = grade;
        }
    }

    public StudentGrade() {
        this("Unknown", 0);
    }

    public StudentGrade(String name, int grade) {
        setStudentName(name);
        setGrade(grade);

    }

    public int getGrade() {
        return this.grade;
    }

    public String getName() {
        return this.studentName;
    }
}

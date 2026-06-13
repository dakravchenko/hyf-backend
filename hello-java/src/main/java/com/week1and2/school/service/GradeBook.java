package com.week1and2.school.service;

import com.week1and2.school.exception.InvalidGradeException;
import com.week1and2.school.exception.ModuleAlreadyCompletedException;
import com.week1and2.school.exception.StudentNotFoundException;
import com.week1and2.school.model.Student;

public class GradeBook {
    private Student[] students;

    public GradeBook(Student[] students) {
        this.students = students;
    }

    public void submitGrade(String studentId, int moduleIndex, int grade)
            throws InvalidGradeException, StudentNotFoundException, ModuleAlreadyCompletedException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException(grade);
        }
        Student student = findStudentById(studentId);

        if (student == null) {
            throw new StudentNotFoundException(studentId);
        }

        if (student.getGrade(moduleIndex) != -1) {
            throw new ModuleAlreadyCompletedException();
        }

        student.setGrade(moduleIndex, grade);
        System.out.println("Grade submitted for " + studentId);
    }

    public double getStudentAverage(String studentId) throws StudentNotFoundException {
        Student student = findStudentById(studentId);

        if (student == null) {
            throw new StudentNotFoundException(studentId);
        }

        int[] grades = student.getGrades();
        int sum = 0;
        int count = 0;

        for (int currentGrade : grades) {
            if (currentGrade != -1) {
                sum += currentGrade;
                count++;
            }
        }

        if (count == 0) {
            return 0.0;
        }

        return (double) sum / count;
    }

    private Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }
}
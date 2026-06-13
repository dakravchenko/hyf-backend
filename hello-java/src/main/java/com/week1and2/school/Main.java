package com.week1and2.school;

import com.week1and2.school.exception.InvalidGradeException;
import com.week1and2.school.exception.ModuleAlreadyCompletedException;
import com.week1and2.school.exception.StudentNotFoundException;
import com.week1and2.school.model.Student;
import com.week1and2.school.service.GradeBook;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("S001", 3);
        Student s2 = new Student("S002", 3);

        GradeBook gradeBook = new GradeBook(new Student[] { s1, s2 });

        try {
            // normal case
            gradeBook.submitGrade("S001", 0, 80);

            // gradeBook.submitGrade("S001", 0, 90);
            // gradeBook.submitGrade("S001", 0, 110);

            gradeBook.submitGrade("S004", 0, 80);
        } catch (InvalidGradeException | ModuleAlreadyCompletedException | StudentNotFoundException e) {
            System.out.println(e);

        }
    }
}
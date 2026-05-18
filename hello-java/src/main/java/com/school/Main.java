package com.school;

import com.school.model.Student;
import com.school.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Student daniil = new Student("daniil", 69, 8.8);

        StudentService.printStudent(daniil);
    }
}

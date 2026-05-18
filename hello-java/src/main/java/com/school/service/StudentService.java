package com.school.service;

import com.school.model.Student;
import com.school.utils.GradeUtils;

public class StudentService {
    public static void printStudent(Student student) {

        System.out.println(student.getName() + " " + GradeUtils.isPassing(student.getGpa()));
    }
}

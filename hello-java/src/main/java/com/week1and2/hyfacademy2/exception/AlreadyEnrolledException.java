package com.week1and2.hyfacademy2.exception;

public class AlreadyEnrolledException extends EnrolmentException {
    private String studentName;
    private String courseName;

    public AlreadyEnrolledException(String studentName, String courseName) {
        super(String.format("%s is already enroled in %s", studentName, courseName));
        this.courseName = courseName;
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

}

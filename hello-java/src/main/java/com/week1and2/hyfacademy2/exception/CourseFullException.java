package com.week1and2.hyfacademy2.exception;

public class CourseFullException extends EnrolmentException {
    private String courseName;
    private int maxCapacity;

    public CourseFullException(String courseName, int maxCapacity){
        super(String.format("the course %s has max capacity: %d", courseName, maxCapacity));
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    
}

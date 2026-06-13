package com.week1and2.hyfacademy2.model;

import com.week1and2.hyfacademy2.exception.AlreadyEnrolledException;
import com.week1and2.hyfacademy2.exception.EnrolmentException;

public class Mentor extends User {
    private String expertise;
    private Course[] assignedCourses = new Course[3];
    private int courseCount;
    static int mentorCount = 0;

    public Mentor(String name, String email, String expertise) {
        super(name, email, String.format("COA-%03d", mentorCount + 1));
        this.expertise = expertise;
    }

    @Override
    String getRole() {
        return "MENTOR";
    }

    public void assignToCourse(Course course) {
        if (courseCount > 3) {
            throw new EnrolmentException("Max number of courses has been reached");
        }

        for (Course assignedCourse : assignedCourses) {
            if (assignedCourse == null) {
                continue;
            } else if (assignedCourse.equals(course)) {
                throw new EnrolmentException("the mentor is assigned to this course");
            }
        }

        assignedCourses[courseCount] = course;

    }

    public Course[] getAssignedCourses() {
        return assignedCourses;
    }

    public String getExpertise() {
        return expertise;
    }

}

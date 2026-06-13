package com.week1and2.hyfacademy2.model;

import com.week1and2.hyfacademy2.exception.AlreadyEnrolledException;
import com.week1and2.hyfacademy2.exception.EnrolmentException;

public class Student extends User {
    private Course[] enrolledCourses = new Course[5];
    private int courseCount;
    static int studentCount;

    public Student(String name, String email) {
        super(name, email, String.format("STU-%03d", studentCount + 1));
        studentCount += 1;

    }

    @Override
    String getRole() {
        return "STUDENT";
    }

    public void enrol(Course course) {
        if (courseCount > 5) {
            throw new EnrolmentException(String.format("user %s cannot be enrolled to more than 5 courses", getName()));
        }
        for (Course enrolledCourse : enrolledCourses) {
            if (enrolledCourse == null) {
                continue;
            } else if (enrolledCourse.equals(course)) {
                throw new AlreadyEnrolledException(getName(), course.getCourseName());
            }
        }

        

        enrolledCourses[courseCount] = course;
        courseCount += 1;

    }

    public Course[] getCourses() {
        return enrolledCourses;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public int getProgress(String courseName) {
        if (enrolledCourses.length == 0) {
            throw new EnrolmentException("student is not enrolled in any course");
        }
        int score = 0;
        for (int i = 0; i < enrolledCourses.length; i++) {
            if (enrolledCourses[i] == null) {
                continue;
            } else if (enrolledCourses[i].getCourseName().equals(courseName)) {
                score = enrolledCourses[i].getStudentProgress()[i];
                break;
            }
        }
        return score;
    }

}

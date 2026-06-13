package com.week1and2.hyfacademy2.model;

import java.util.Objects;

import com.week1and2.hyfacademy2.exception.AlreadyEnrolledException;
import com.week1and2.hyfacademy2.exception.CourseFullException;
import com.week1and2.hyfacademy2.exception.EnrolmentException;
import com.week1and2.hyfacademy2.exception.InvalidProgressException;
import com.week1and2.hyfacademy2.service.Enrollable;

public abstract class Course implements Enrollable {
    private String courseName;
    private String courseId;
    private int maxStudents;
    private int enrolledCount;
    private int[] studentProgress = new int[] { 0, 0, 0, 0, 0 };
    static int courseCounter = 0;

    public Course(String courseName, int maxStudents) {
        setCourseName(courseName.trim());
        setMaxStudents(maxStudents);
        this.courseId = String.format("CRS-%03d", courseCounter + 1);

    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.equals("")) {
            throw new IllegalArgumentException("Course name is not valid");
        }
        this.courseName = courseName;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents <= 0) {
            throw new IllegalArgumentException("max students number should be rater than 0");
        }
        this.maxStudents = maxStudents;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getEnrolledCount() {
        return enrolledCount;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int[] getStudentProgress() {
        return studentProgress;
    }

    public void setEnrolledCount(int enrolledCount) {
        this.enrolledCount = enrolledCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Course other = (Course) obj;

        return courseId.equals(other.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }

    public void enrol(Student student) {
        if (enrolledCount > maxStudents) {
            throw new CourseFullException(getCourseName(), getMaxStudents());
        }

        for (Course course : student.getCourses()) {
            if (course == null) {
                continue;
            } else if (course.getCourseId().equals(courseId)) {
                throw new AlreadyEnrolledException(student.getName(), courseName);
            }
        }

        enrolledCount += 1;

    }

    public void updateProgress(Student student, int progress) {
        if (student == null) {
            throw new EnrolmentException("student is not enrolled");
        }

        if (progress < 0 || progress > 100) {
            throw new InvalidProgressException(progress);
        }

        int index = -1;

        for (int i = 0; i < student.getCourses().length; i++) {
            if (student.getCourses()[i] == null) {
                continue;
            } else if (student.getCourses()[i].getCourseId().equals(courseId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new EnrolmentException("student is not enrolled");
        }

        // student.getCourses()[index].studentProgress[index] = progress;
        studentProgress[index] = progress;

    }

    public int getStudentProgress(Student student) {
        if (student == null) {
            throw new EnrolmentException("Student is not enrolled");
        }

        int index = -1;

        for (int i = 0; i < student.getCourses().length; i++) {
            if (student.getCourses()[i] == null) {
                continue;
            } else if (student.getCourses()[i].getCourseId().equals(courseId)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new EnrolmentException("student is not enrolled");
        }

        return studentProgress[index];

    }

    public boolean isFull() {
        return enrolledCount == maxStudents;
    }

    abstract String getCourseType();

    abstract String getScheduleInfo();

    @Override
    public String toString() {
        return String.format("[%s] %s (%s) | Enrolled: %d/%d", courseId, courseName, getCourseType(), enrolledCount,
                maxStudents);
    }

}

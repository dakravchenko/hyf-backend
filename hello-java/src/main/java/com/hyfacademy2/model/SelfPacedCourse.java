package com.hyfacademy2.model;

import com.hyfacademy2.service.Reportable;

public class SelfPacedCourse extends Course implements Reportable {
    private int estimatedHours;

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public SelfPacedCourse(String courseName, int maxStudents, int estimatedHours) {
        super(courseName, maxStudents);
        this.estimatedHours = estimatedHours;
    }

    @Override
    String getCourseType() {
        return "Self-Paced";
    }

    @Override
    String getScheduleInfo() {
        return String.format("Estimated: %d hours — complete at your own pace", estimatedHours);
    }

}

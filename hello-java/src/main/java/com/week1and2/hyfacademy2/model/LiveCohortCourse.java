package com.week1and2.hyfacademy2.model;
// package com.hyfacademy2.model;

// import com.hyfacademy2.service.Reportable;

// public class LiveCohortCourse extends Course implements Reportable {
//     private String startDate;
//     private String endDate;
//     private Mentor mentor;

//     public LiveCohortCourse(String courseName, int maxStudents, String startDate, String endDate) {
//         super(courseName, maxStudents);
//         this.endDate = endDate;
//         this.startDate = startDate;

//     }

//     public String getStartDate() {
//         return startDate;
//     }

//     public String getEndDate() {
//         return endDate;
//     }

//     public Mentor getMentor() {
//         return mentor;
//     }

//     @Override
//     String getCourseType() {
//         return "Live Cohort";
//     }

//     @Override
//     String getScheduleInfo() {
//         return String.format("%s to %s | Mentor: %s", startDate, endDate, mentor.getName());
//     }

//     public void assignMentor(Mentor mentor) {
//         this.mentor = mentor;
//         mentor.assignToCourse(this);
//     }

// }

package com.example.securitybasic.model;

/**
 * Created by : maru
 * Date  : 2/4/2020
 * Time  : 5:01 PM
 */

public class Student {

    private final Integer studentId;
    private final String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}

package com.example.securitybasic.controller;

import com.example.securitybasic.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by : maru
 * Date  : 2/4/2020
 * Time  : 5:00 PM
 */


@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "maru"),
            new Student(2, "nero"),
            new Student(3, "ichi")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return STUDENTS.stream().filter(student -> studentId.equals(student.getStudentId()))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Student " + studentId + "does not exits"));
    }
}

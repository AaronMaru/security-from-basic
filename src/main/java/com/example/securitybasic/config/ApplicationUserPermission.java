package com.example.securitybasic.config;

/**
 * Created by : maru
 * Date  : 2/5/2020
 * Time  : 5:47 PM
 */

public enum ApplicationUserPermission {

    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}

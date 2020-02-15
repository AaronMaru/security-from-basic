package com.example.securitybasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by : maru
 * Date  : 2/8/2020
 * Time  : 5:03 PM
 */

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/courses")
    public String getCourses() {
        return "courses";
    }


}
package com.example.studentWebAppDevops.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Student {
    //--------------------getAllStudents------------------------//
    @GetMapping("/students")
    public String getAllStudents() {

        return "Bonjour Devops";
    }
}

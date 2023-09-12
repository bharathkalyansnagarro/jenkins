package com.nagarro.jenkins.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jenkins")
@Tag(name = "Jenkins")
@CrossOrigin("*")
public class JenkinsController {


    @GetMapping("")
    public List<String> greetUser() {
        return List.of("Hello User", "Welcome to Jenkins Pipeline");
    }

    @GetMapping("about")
    public List<String> aboutPage() {

        return List.of(
                "Nagarro",
                "Bharath Kalyan S",
                "Java + FSD",
                "1+ Year of Exp"
        );
    }

}

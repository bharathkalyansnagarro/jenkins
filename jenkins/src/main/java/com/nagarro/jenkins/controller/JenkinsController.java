package com.nagarro.jenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jenkins")
public class JenkinsController {


    @GetMapping("")
    public List<String> greetUser() {
        return List.of("Hello User", "Welcome to Jenkins Pipeline");
    }


}

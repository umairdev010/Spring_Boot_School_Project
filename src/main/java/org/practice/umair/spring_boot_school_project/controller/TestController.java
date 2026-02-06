package org.practice.umair.spring_boot_school_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        return "PONG! Web is working at " + new java.util.Date();
    }

    @GetMapping("/school/ping2")
    public String ping2() {
        return "✅ PONG with context path! Your app is running!";
    }
}
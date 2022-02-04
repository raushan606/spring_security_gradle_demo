package com.gradle.demogradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {
    
    @GetMapping("/home")
    public String getHome() {
        System.out.println("Homepage");
        return "Home";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("Homepage");
        return "Home";
    }

    @GetMapping("/register")
    public String register() {
        System.out.println("Homepage");
        return "Home";
    }
}

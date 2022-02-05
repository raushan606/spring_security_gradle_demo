package com.gradle.demogradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class TestController {
    

    @GetMapping(value="/signin") 
    public String signin() {
        return "login";
    }
}

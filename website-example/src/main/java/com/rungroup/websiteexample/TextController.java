package com.rungroup.websiteexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }



}

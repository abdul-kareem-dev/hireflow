package com.kareem.hireflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    String hello() {
        return "Hello from HireFlow!"+"\nThis is my first SpringBoot Project and Application";
    }
}

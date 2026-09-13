package com.kareem.hireflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    String hello() {
        return "Hello from HireFlow!"+" \n This is my first SpringBoot Project and Application";
    }

    @GetMapping("/api/job-details")
    Job jobDetails(){
        Job job = new Job();
        job.setId(1);
        job.setTitle("Java Full Stack Developer");
        job.setCompany("Amazon");
        job.setLocation("Hyderabad");
        return job;
    }


}

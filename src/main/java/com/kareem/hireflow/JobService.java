package com.kareem.hireflow;

import org.springframework.stereotype.Service;

@Service
public class JobService {

    Job getJob(){
        Job job = new Job(1,"Java Full Stack Developer","Amazon","Hyderabad");
        return job;
    }

    public JobService(){
        System.out.println("JobService object created");
    }
}

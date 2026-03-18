package com.Iggy.jobboard.controller;

import com.Iggy.jobboard.entity.Job;
import com.Iggy.jobboard.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }


    @PostMapping
    public Job createJob(@RequestBody Job job){
        return jobService.saveJob(job);
    }

    @GetMapping("/{id}")
    public Optional<Job> getJobId(@PathVariable Long id){
        return jobService.getJobById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id){
        jobService.deleteJob(id);
    }





}

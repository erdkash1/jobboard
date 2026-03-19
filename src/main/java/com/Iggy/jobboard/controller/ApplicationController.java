package com.Iggy.jobboard.controller;

import com.Iggy.jobboard.entity.Application;
import com.Iggy.jobboard.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;


    @GetMapping
    public List<Application> getAllApplications(){
        return applicationService.getAllApplication();
    }

    @PostMapping
    public Application createApplication(@RequestBody Application application){
        return applicationService.saveApplication(application);

    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id){
        applicationService.deleteApplication(id);
    }



}

package com.Iggy.jobboard.service;

import com.Iggy.jobboard.entity.Job;
import com.Iggy.jobboard.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }
    public Optional<Job> getJobById(Long id){
        return jobRepository.findById(id);
    }
    public Job saveJob(Job job){
        return jobRepository.save(job);
    }

    public void deleteJob(Long id){
        jobRepository.deleteById(id);
    }
}

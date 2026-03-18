package com.Iggy.jobboard.service;

import com.Iggy.jobboard.entity.Application;
import com.Iggy.jobboard.entity.User;
import com.Iggy.jobboard.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public List<Application> getAllApplication(){
        return applicationRepository.findAll();
    }

    public List<Application> getApplicationByUser(User user){
        return applicationRepository.findByUser(user);
    }

    public Application saveApplication(Application application){
        return applicationRepository.save(application);
    }

    public void deleteApplication(Long id){
        applicationRepository.deleteById(id);
    }
}

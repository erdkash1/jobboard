package com.Iggy.jobboard.repository;

import com.Iggy.jobboard.entity.Application;
import com.Iggy.jobboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    public List<Application> findByUser(User user);
}

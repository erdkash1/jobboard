package com.Iggy.jobboard.repository;

import com.Iggy.jobboard.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}

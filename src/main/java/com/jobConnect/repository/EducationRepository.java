package com.jobConnect.repository;

import com.jobConnect.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EducationRepository extends JpaRepository<Education, Long> {
    List<Education> findByCandidateId(Long candidateId);
}

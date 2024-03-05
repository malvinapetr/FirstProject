package com.digipath.internship.learning.repository;

import com.digipath.internship.learning.domain.LearningEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningRepository extends JpaRepository<LearningEntity, Long> {
}

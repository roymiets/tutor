package com.abhishek.tutor.repository;

import com.abhishek.tutor.entity.CoachingSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachingSubjectRepo extends JpaRepository<CoachingSubject,Long> {
}

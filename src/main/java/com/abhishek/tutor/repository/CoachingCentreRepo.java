package com.abhishek.tutor.repository;

import com.abhishek.tutor.entity.CoachingCentre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachingCentreRepo extends JpaRepository<CoachingCentre,Long> {
}

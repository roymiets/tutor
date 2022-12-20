package com.abhishek.tutor.repository;

import com.abhishek.tutor.entity.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepo extends JpaRepository<Qualification,Long> {
}

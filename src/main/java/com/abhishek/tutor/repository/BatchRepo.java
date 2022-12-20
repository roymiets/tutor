package com.abhishek.tutor.repository;

import com.abhishek.tutor.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepo extends JpaRepository<Batch,Long> {
}

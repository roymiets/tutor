package com.abhishek.tutor.repository;

import com.abhishek.tutor.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo  extends JpaRepository<Subject,Long> {
}

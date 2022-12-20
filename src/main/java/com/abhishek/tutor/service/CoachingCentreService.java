package com.abhishek.tutor.service;

import com.abhishek.tutor.entity.CoachingCentre;
import com.abhishek.tutor.repository.CoachingCentreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CoachingCentreService {
    @Autowired
    private CoachingCentreRepo coachingCentreRepo;

    public CoachingCentre add( CoachingCentre centre) {
        return coachingCentreRepo.save(centre);
    }

    public List<CoachingCentre> getall() {
        return coachingCentreRepo.findAll();
    }
}

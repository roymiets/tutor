package com.abhishek.tutor.controller;

import com.abhishek.tutor.entity.CoachingCentre;
import com.abhishek.tutor.service.CoachingCentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coachingCentre")
public class CoachingCentreController {
  @Autowired
  private CoachingCentreService coachingCentreService;
    @PostMapping("/add")
    public CoachingCentre addCoaching(@RequestBody CoachingCentre centre) {
      return coachingCentreService.add(centre);
    }

    @GetMapping("/getall")
  public List<CoachingCentre> getall(){
      return coachingCentreService.getall();
    }
}

package com.abhishek.tutor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class CoachingCentre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String coachingName;
    @ManyToOne
    private City city;


}

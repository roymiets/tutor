package com.abhishek.tutor.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long batchId;
    private String startTime;
    private String startDate;
    private String duration;
    @ManyToOne
    private Subject subject;
    @ManyToOne
    private CoachingCentre centre;

    @CreationTimestamp
    Date createTimestamp;

    @UpdateTimestamp
    Date updateTimestamp;


}

package com.julienvanhaeren.travelplanner.model;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Travel {
    private String travelType;
    private String departureDestination;
    private String arrivalDestination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
}

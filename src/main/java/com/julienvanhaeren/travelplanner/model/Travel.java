package com.julienvanhaeren.travelplanner.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "travels")
public class Travel {

    @Column(name = "travel_type")
    private String travelType;

    @Column(name = "departure_destination")
    private String departureDestination;

    @Column(name = "arrival_destination")
    private String arrivalDestination;

    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;

    @OneToOne
    private Destination destination;
}

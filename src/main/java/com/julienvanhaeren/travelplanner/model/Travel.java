package com.julienvanhaeren.travelplanner.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "travels")
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "travel_type")
    private String travelType;

    @Column(name = "departure_time")
    private LocalDateTime departureTime;

    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;

//    @OneToOne
//    private Destination departureDestination;
//
//    @OneToOne
//    private Destination arrivalDestination;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;


}

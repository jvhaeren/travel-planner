package com.julienvanhaeren.travelplanner.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "destinations")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "arrival_date")
    private LocalDate arrivalDate;

    @Column(name = "departure_date")
    private LocalDate departureDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destination")
    private Set<Sight> sights;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destination")
    private Set<Accommodation> accommodations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destination")
    private Set<Meal> meals;

    @OneToOne
    private Travel travel;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;
}

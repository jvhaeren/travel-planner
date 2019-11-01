package com.julienvanhaeren.travelplanner.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trip")
    private Set<Destination> destinations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trip")
    private Set<Travel> travels = new HashSet<>();
}

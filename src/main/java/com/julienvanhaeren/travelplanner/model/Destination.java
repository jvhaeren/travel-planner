package com.julienvanhaeren.travelplanner.model;

import java.time.LocalDate;
import java.util.Set;

public class Destination {
    private String city;
    private String country;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private Set<Sight> sights;
    private Set<Accommodation> accommodations;
    private Set<Meal> meals;
    private Travel travel;
}

package com.julienvanhaeren.travelplanner.model;

import java.util.HashSet;
import java.util.Set;

public class Trip {
    private String name;
    private Set<Destination> destinations = new HashSet<>();
}

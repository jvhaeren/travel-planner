package com.julienvanhaeren.travelplanner.repositories;

import com.julienvanhaeren.travelplanner.model.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, Long> {
}

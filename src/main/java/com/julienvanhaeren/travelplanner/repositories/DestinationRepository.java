package com.julienvanhaeren.travelplanner.repositories;

import com.julienvanhaeren.travelplanner.model.Destination;
import org.springframework.data.repository.CrudRepository;

public interface DestinationRepository extends CrudRepository<Destination, Long> {
}

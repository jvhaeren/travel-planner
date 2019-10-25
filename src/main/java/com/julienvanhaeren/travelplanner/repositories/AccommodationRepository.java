package com.julienvanhaeren.travelplanner.repositories;

import com.julienvanhaeren.travelplanner.model.Accommodation;
import org.springframework.data.repository.CrudRepository;

public interface AccommodationRepository extends CrudRepository<Accommodation, Long> {
}

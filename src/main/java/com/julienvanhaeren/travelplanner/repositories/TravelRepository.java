package com.julienvanhaeren.travelplanner.repositories;
import com.julienvanhaeren.travelplanner.model.Travel;
import org.springframework.data.repository.CrudRepository;

public interface TravelRepository extends CrudRepository<Travel, Long> {
}

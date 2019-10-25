package com.julienvanhaeren.travelplanner.repositories;

import com.julienvanhaeren.travelplanner.model.Meal;
import org.springframework.data.repository.CrudRepository;

public interface MealRepository extends CrudRepository<Meal, Long> {
}

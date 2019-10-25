package com.julienvanhaeren.travelplanner.services;

import com.julienvanhaeren.travelplanner.model.Meal;
import com.julienvanhaeren.travelplanner.repositories.MealRepository;

import java.util.HashSet;
import java.util.Set;

public class MealService implements CrudService<Meal, Long>{

    private final MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public Set<Meal> findAll() {
        Set<Meal> meals = new HashSet<>();
        mealRepository.findAll().forEach(meals::add);
        return meals;
    }

    @Override
    public Meal findById(Long aLong) {
        return mealRepository.findById(aLong).orElse(null);
    }

    @Override
    public Meal save(Meal object) {
        return mealRepository.save(object);
    }

    @Override
    public void delete(Meal object) {
        mealRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        mealRepository.deleteById(aLong);
    }
}

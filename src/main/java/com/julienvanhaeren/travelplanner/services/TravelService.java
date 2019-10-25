package com.julienvanhaeren.travelplanner.services;

import com.julienvanhaeren.travelplanner.model.Travel;
import com.julienvanhaeren.travelplanner.repositories.TravelRepository;

import java.util.HashSet;
import java.util.Set;

public class TravelService implements CrudService<Travel, Long>{

    private final TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    @Override
    public Set<Travel> findAll() {
        Set<Travel> travels = new HashSet<>();
        travelRepository.findAll().forEach(travels::add);
        return travels;
    }

    @Override
    public Travel findById(Long aLong) {
        return travelRepository.findById(aLong).orElse(null);
    }

    @Override
    public Travel save(Travel object) {
        return travelRepository.save(object);
    }

    @Override
    public void delete(Travel object) {
        travelRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        travelRepository.deleteById(aLong);
    }
}

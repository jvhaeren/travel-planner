package com.julienvanhaeren.travelplanner.services;

import com.julienvanhaeren.travelplanner.model.Sight;
import com.julienvanhaeren.travelplanner.repositories.SightRepository;

import java.util.HashSet;
import java.util.Set;

public class SightService implements CrudService<Sight, Long> {

    private final SightRepository sightRepository;

    public SightService(SightRepository sightRepository) {
        this.sightRepository = sightRepository;
    }

    @Override
    public Set<Sight> findAll() {
        Set<Sight> sights = new HashSet<>();
        sightRepository.findAll().forEach(sights::add);
        return sights;
    }

    @Override
    public Sight findById(Long aLong) {
        return sightRepository.findById(aLong).orElse(null);
    }

    @Override
    public Sight save(Sight object) {
        return sightRepository.save(object);
    }

    @Override
    public void delete(Sight object) {
        sightRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        sightRepository.deleteById(aLong);
    }
}

package com.julienvanhaeren.travelplanner.services;

import com.julienvanhaeren.travelplanner.model.Trip;
import com.julienvanhaeren.travelplanner.repositories.TripRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TripService implements CrudService<Trip, Long> {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public Set<Trip> findAll() {
        Set<Trip> trips = new HashSet<>();
        tripRepository.findAll().forEach(trips::add);
        return trips;
    }

    @Override
    public Trip findById(Long aLong) {
        return tripRepository.findById(aLong).orElse(null);
    }

    @Override
    public Trip save(Trip object) {
        return tripRepository.save(object);
    }

    @Override
    public void delete(Trip object) {
        tripRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        tripRepository.deleteById(aLong);
    }
}

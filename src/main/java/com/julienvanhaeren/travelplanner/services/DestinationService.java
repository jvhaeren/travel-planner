package com.julienvanhaeren.travelplanner.services;

import com.julienvanhaeren.travelplanner.model.Destination;
import com.julienvanhaeren.travelplanner.repositories.DestinationRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DestinationService implements CrudService<Destination, Long> {

    private final DestinationRepository destinationRepository;

    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @Override
    public Set<Destination> findAll() {
        Set<Destination> destinations = new HashSet<>();
        destinationRepository.findAll().forEach(destinations::add);
        return destinations;
    }

    @Override
    public Destination findById(Long aLong) {
        return destinationRepository.findById(aLong).orElse(null);
    }

    @Override
    public Destination save(Destination object) {
        return destinationRepository.save(object);
    }

    @Override
    public void delete(Destination object) {
        destinationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        destinationRepository.deleteById(aLong);
    }
}

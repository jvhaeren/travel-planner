package com.julienvanhaeren.travelplanner.services;

import com.julienvanhaeren.travelplanner.model.Accommodation;
import com.julienvanhaeren.travelplanner.repositories.AccommodationRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class AccommodationService implements CrudService<Accommodation, Long> {

    private final AccommodationRepository accommodationRepository;

    public AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    @Override
    public Set<Accommodation> findAll() {
        Set<Accommodation> accommodations = new HashSet<>();
        accommodationRepository.findAll().forEach(accommodations::add);
        return accommodations;
    }

    @Override
    public Accommodation findById(Long aLong) {
        return accommodationRepository.findById(aLong).orElse(null);
    }

    @Override
    public Accommodation save(Accommodation object) {
        return accommodationRepository.save(object);
    }

    @Override
    public void delete(Accommodation object) {
        accommodationRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        accommodationRepository.deleteById(aLong);
    }
}

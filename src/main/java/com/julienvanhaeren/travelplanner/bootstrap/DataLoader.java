package com.julienvanhaeren.travelplanner.bootstrap;

import com.julienvanhaeren.travelplanner.model.Destination;
import com.julienvanhaeren.travelplanner.model.Meal;
import com.julienvanhaeren.travelplanner.model.Trip;
import com.julienvanhaeren.travelplanner.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final TripService tripService;
    private final DestinationService destinationService;
    private final TravelService travelService;
    private final AccommodationService accommodationService;
    private final MealService mealService;
    private final SightService sightService;

    public DataLoader(TripService tripService, DestinationService destinationService, TravelService travelService,
                      AccommodationService accommodationService, MealService mealService, SightService sightService) {
        this.tripService = tripService;
        this.destinationService = destinationService;
        this.travelService = travelService;
        this.accommodationService = accommodationService;
        this.mealService = mealService;
        this.sightService = sightService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = tripService.findAll().size();

        if(count == 0){
            loadData();
        }
    }

    private void loadData(){
        Trip trip1 = new Trip();
        trip1.setName("india");

        Destination jaipur = new Destination();
        jaipur.setCity("Jaipur");
        jaipur.setTrip(trip1);

        Meal meal1 = new Meal();
        meal1.setName("maaltijd");
        meal1.setDestination(jaipur);

        jaipur.getMeals().add(meal1);
        trip1.getDestinations().add(jaipur);
    }

}

package com.julienvanhaeren.travelplanner.bootstrap;

import com.julienvanhaeren.travelplanner.model.*;
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
        Trip trip = new Trip();
        trip.setName("trip_name");

        Destination india1 = new Destination();
        india1.setCity("jaipur");
        india1.setCountry("india");
        destinationService.save(india1);

        Destination india2 = new Destination();
        india2.setCity("delhi");
        india2.setCountry("india");

        Accommodation acco11 = new Accommodation();
        acco11.setName("hotel1");
        acco11.setCity("jaipur");
        acco11.setStreetName("street1");
        accommodationService.save(acco11);

        Accommodation acco21 = new Accommodation();
        acco21.setName("hotel2");
        acco21.setCity("delhi");
        acco21.setStreetName("street1");

        Meal meal11 = new Meal();
        meal11.setName("Curry");
        mealService.save(meal11);

        Meal meal12 = new Meal();
        meal12.setName("Thali");

        Meal meal21 = new Meal();
        meal11.setName("Curry2");

        Meal meal22 = new Meal();
        meal12.setName("Thali2");

        Sight sight11 = new Sight();
        sight11.setName("tajmahal");
        sightService.save(sight11);

        Sight sight21 = new Sight();
        sight11.setName("tombe");

        india1.getAccommodations().add(acco11);
        india1.getMeals().add(meal11);
        india1.getMeals().add(meal12);
        india1.getSights().add(sight11);

        india2.getAccommodations().add(acco21);
        india2.getMeals().add(meal21);
        india2.getMeals().add(meal22);
        india2.getSights().add(sight21);

        trip.getDestinations().add(india1);
        trip.getDestinations().add(india2);

        tripService.save(trip);
    }

}

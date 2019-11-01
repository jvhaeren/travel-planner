package com.julienvanhaeren.travelplanner.bootstrap;

import com.julienvanhaeren.travelplanner.model.*;
import com.julienvanhaeren.travelplanner.services.TravelService;
import com.julienvanhaeren.travelplanner.services.TripService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final TripService tripService;
    private final TravelService travelService;

    public DataLoader(TripService tripService, TravelService travelService) {
        this.tripService = tripService;
        this.travelService = travelService;
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
        trip1.setName("India");

        Destination jaipur = new Destination();
        jaipur.setCity("Jaipur");
        jaipur.setTrip(trip1);

        Destination udaipur = new Destination();
        udaipur.setCity("Udaipur");
        udaipur.setTrip(trip1);

        Meal meal11 = new Meal();
        meal11.setName("ontbijt jaipur");
        meal11.setDestination(jaipur);

        Meal meal12 = new Meal();
        meal12.setName("lunch jaipur");
        meal12.setDestination(jaipur);

        Meal meal13 = new Meal();
        meal13.setName("diner jaipur");
        meal13.setDestination(jaipur);

        Accommodation hotel1 = new Accommodation();
        hotel1.setName("Palace Hotel");
        hotel1.setDestination(jaipur);
        Accommodation hotel2 = new Accommodation();
        hotel2.setName("Hi Hostel");
        hotel2.setDestination(udaipur);

        Meal meal21 = new Meal();
        meal21.setName("ontbijt udaipur");
        meal21.setDestination(udaipur);

        Meal meal22 = new Meal();
        meal22.setName("lunch udaipur");
        meal22.setDestination(udaipur);

        Meal meal23 = new Meal();
        meal23.setName("diner udaipur");
        meal23.setDestination(udaipur);

        Travel travel1 = new Travel();
        travel1.setTravelType("Train");
        travel1.setDepartureDestination(jaipur);
        travel1.setArrivalDestination(udaipur);
        travel1.setTrip(trip1);

        trip1.getTravels().add(travel1);


        jaipur.getMeals().add(meal11);
        jaipur.getMeals().add(meal12);
        jaipur.getMeals().add(meal13);
        jaipur.getAccommodations().add(hotel1);
        trip1.getDestinations().add(jaipur);


        udaipur.getMeals().add(meal21);
        udaipur.getMeals().add(meal22);
        udaipur.getMeals().add(meal23);
        udaipur.getAccommodations().add(hotel2);
        trip1.getDestinations().add(udaipur);

        tripService.save(trip1);



    }

}

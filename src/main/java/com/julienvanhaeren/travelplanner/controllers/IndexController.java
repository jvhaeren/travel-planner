package com.julienvanhaeren.travelplanner.controllers;

import com.julienvanhaeren.travelplanner.services.DestinationService;
import com.julienvanhaeren.travelplanner.services.MealService;
import com.julienvanhaeren.travelplanner.services.TripService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final TripService tripService;
    private final DestinationService destinationService;
    private final MealService mealService;

    public IndexController(TripService tripService, DestinationService destinationService, MealService mealService) {
        this.tripService = tripService;
        this.destinationService = destinationService;
        this.mealService = mealService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(Model model){
        model.addAttribute("trips", tripService.findAll());
        return "index";
    }
}

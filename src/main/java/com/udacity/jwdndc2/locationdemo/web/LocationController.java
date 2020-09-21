package com.udacity.jwdndc2.locationdemo.web;

import com.udacity.jwdndc2.locationdemo.entity.Location;
import com.udacity.jwdndc2.locationdemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/locations")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> list = locationService.getAllLocations();

        return new ResponseEntity<List<Location>>(list, HttpStatus.OK);
    }
}

package com.udacity.jwdndc2.locationdemo.service;

import com.udacity.jwdndc2.locationdemo.entity.Location;
import com.udacity.jwdndc2.locationdemo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return (List<Location>) locationRepository.findAll();
    }
}

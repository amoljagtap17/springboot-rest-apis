package com.udacity.jwdndc2.locationdemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udacity.jwdndc2.locationdemo.entity.Location;
import com.udacity.jwdndc2.locationdemo.repository.LocationRepository;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private LocationRepository locationRepository;

    public Query(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Iterable<Location> findAllLocations() {
        return locationRepository.findAll();
    }

}

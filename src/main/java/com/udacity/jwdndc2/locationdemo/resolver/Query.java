package com.udacity.jwdndc2.locationdemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udacity.jwdndc2.locationdemo.entity.Dog;
import com.udacity.jwdndc2.locationdemo.entity.Location;
import com.udacity.jwdndc2.locationdemo.exception.DogNotFoundException;
import com.udacity.jwdndc2.locationdemo.repository.DogRepository;
import com.udacity.jwdndc2.locationdemo.repository.LocationRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private LocationRepository locationRepository;
    private DogRepository dogRepository;

    public Query(LocationRepository locationRepository, DogRepository dogRepository) {
        this.locationRepository = locationRepository;
        this.dogRepository = dogRepository;
    }

    public Iterable<Location> findAllLocations() {
        return locationRepository.findAll();
    }

    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }

    public Dog findDogById(Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if (optionalDog.isPresent()) {
            return optionalDog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }
}

package com.udacity.jwdndc2.locationdemo.service;

import com.udacity.jwdndc2.locationdemo.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}

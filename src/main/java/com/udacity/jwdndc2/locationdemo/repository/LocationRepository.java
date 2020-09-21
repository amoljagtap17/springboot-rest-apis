package com.udacity.jwdndc2.locationdemo.repository;

import com.udacity.jwdndc2.locationdemo.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}

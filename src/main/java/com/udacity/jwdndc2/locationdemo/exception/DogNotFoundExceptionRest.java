package com.udacity.jwdndc2.locationdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
public class DogNotFoundExceptionRest extends RuntimeException {

    public DogNotFoundExceptionRest() {
    }

    public DogNotFoundExceptionRest(String message) {
        super(message);
    }
}
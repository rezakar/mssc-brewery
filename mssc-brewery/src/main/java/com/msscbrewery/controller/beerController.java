package com.msscbrewery.controller;

import com.msscbrewery.model.Beer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class beerController {

    @GetMapping({"/{beerId}"})
    public ResponseEntity<Beer> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(Beer.builder().build(), HttpStatus.OK);
    }
}

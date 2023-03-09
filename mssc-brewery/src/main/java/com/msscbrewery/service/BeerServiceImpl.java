package com.msscbrewery.service;

import com.msscbrewery.model.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID beerId) {
        return Beer.builder().id(UUID.randomUUID())
                .beerName("Galaxy")
                .beerStyle("Pale Ale")
                .build();
    }
}

package com.msscbrewery.service;

import com.msscbrewery.model.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface BeerService {
    Beer getBeerById(UUID beerId);
}

package com.kagboton.spring6restmvc.services;

import com.kagboton.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}

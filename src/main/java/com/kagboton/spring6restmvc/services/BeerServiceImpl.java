package com.kagboton.spring6restmvc.services;

import com.kagboton.spring6restmvc.model.Beer;
import com.kagboton.spring6restmvc.model.BeerStyle;

import java.time.LocalDateTime;
import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        return Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Explosive Dog")
                .upc("1234")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}

package com.kagboton.spring6restmvc.services;

import com.kagboton.spring6restmvc.model.Beer;
import com.kagboton.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Get beer id - in service");
        return Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Explosive Dog")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("1234")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}

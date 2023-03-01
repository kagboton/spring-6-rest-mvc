package com.kagboton.spring6restmvc.services;

import com.kagboton.spring6restmvc.model.Beer;
import com.kagboton.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;
    public BeerServiceImpl() {
        this.beerMap = new HashMap<>();

        Beer beer1 =  Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Explosive Dog")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("1234")
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer2 =
                Beer.builder()
                        .id(UUID.randomUUID())
                        .version(1)
                        .beerName("Crank")
                        .beerStyle(BeerStyle.PALE_ALE)
                        .upc("1234")
                        .createdDate(LocalDateTime.now())
                        .updateDate(LocalDateTime.now())
                        .build();

        Beer beer3 =
                Beer.builder()
                        .id(UUID.randomUUID())
                        .version(1)
                        .beerName("Awoyo")
                        .beerStyle(BeerStyle.GOSE)
                        .upc("1234")
                        .createdDate(LocalDateTime.now())
                        .updateDate(LocalDateTime.now())
                        .build();

        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public List<Beer> listBeers(){
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Get beer id - in service");
        return beerMap.get(id);
    }
}

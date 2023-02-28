package com.kagboton.spring6restmvc.controllers;

import com.kagboton.spring6restmvc.model.Beer;
import com.kagboton.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@Controller
@AllArgsConstructor
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        log.debug("Get beer id - in controller");
        return beerService.getBeerById(id);
    }
}

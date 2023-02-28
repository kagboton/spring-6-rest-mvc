package com.kagboton.spring6restmvc.controllers;

import com.kagboton.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class BeerController {
    private final BeerService beerService;
}

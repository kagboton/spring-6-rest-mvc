package com.kagboton.spring6restmvc.controllers;

import com.kagboton.spring6restmvc.model.Customer;
import com.kagboton.spring6restmvc.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        log.debug("Init Customer controller");
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerService.listCustomers();
    }

    @GetMapping("/{customerId}")
    Customer getCustomerById(@PathVariable String customerId){
        return customerService.getCustomerById(customerId);
    }
}

package com.kagboton.spring6restmvc.services;

import com.kagboton.spring6restmvc.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomers();
    Customer getCustomerById(String id);
}

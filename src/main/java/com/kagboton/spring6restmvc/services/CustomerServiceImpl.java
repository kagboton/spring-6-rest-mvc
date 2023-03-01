package com.kagboton.spring6restmvc.services;

import com.kagboton.spring6restmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final Map<String, Customer> customerMap;

    public CustomerServiceImpl() {
        this.customerMap = new HashMap<>();

        Customer eric = Customer.builder()
                .customerName("Eric Herve")
                .id("1")
                .updatedDate(LocalDateTime.now()).build();
        Customer veronique = Customer.builder()
                .id("2")
                .customerName("Veronique Courjault")
                .updatedDate(LocalDateTime.now()).build();

        customerMap.put(eric.getId(), eric);
        customerMap.put(veronique.getId(), veronique);
    }

    @Override
    public List<Customer> listCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomerById(String id) {
        return customerMap.get(id);
    }
}

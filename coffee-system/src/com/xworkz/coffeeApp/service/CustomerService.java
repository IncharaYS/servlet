package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CoffeeDTO;
import com.xworkz.coffeeApp.DTO.CustomerDTO;

public interface CustomerService {
    void validateAndSave(CustomerDTO customerDTO);
}

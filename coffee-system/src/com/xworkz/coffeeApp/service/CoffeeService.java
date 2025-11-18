package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CoffeeDTO;

public interface CoffeeService {
    void validateAndSave(CoffeeDTO coffeeDTO);
}

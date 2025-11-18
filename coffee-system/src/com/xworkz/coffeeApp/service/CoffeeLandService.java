package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CoffeeDTO;
import com.xworkz.coffeeApp.DTO.CoffeeLandDTO;

public interface CoffeeLandService {
    void  validateAndSave(CoffeeLandDTO coffeeLandDTO);
}

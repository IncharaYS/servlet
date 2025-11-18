package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CafeteriaDTO;
import com.xworkz.coffeeApp.DTO.CoffeeDTO;

public interface CafeteriaService {
    void validateAndSave(CafeteriaDTO cafeteriaDTO);
}

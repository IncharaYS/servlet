package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CafeteriaDTO;
import com.xworkz.coffeeApp.DTO.CoffeeDTO;

public class CafeteriaServiceImpl implements CafeteriaService{

    @Override
    public void validateAndSave(CafeteriaDTO cafeteriaDTO) {
        System.out.println("Cafeteria service impl overridden method");
        System.out.println("Cafeteria details:"+cafeteriaDTO);
    }
}

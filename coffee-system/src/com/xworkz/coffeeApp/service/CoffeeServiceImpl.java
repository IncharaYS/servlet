package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CoffeeDTO;

public class CoffeeServiceImpl implements CoffeeService{
    @Override
    public void validateAndSave(CoffeeDTO coffeeDTO) {
        System.out.println("Cafeteria service impl overridden method");
        System.out.println("Cafeteria details:"+coffeeDTO);
    }
}

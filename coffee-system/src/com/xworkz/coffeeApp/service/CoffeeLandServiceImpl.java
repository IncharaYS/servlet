package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CoffeeLandDTO;

public class CoffeeLandServiceImpl implements CoffeeLandService{
    @Override
    public void validateAndSave(CoffeeLandDTO coffeeLandDTO) {
        System.out.println("Coffee land service impl overridden method");
        System.out.println("Coffee land details:"+coffeeLandDTO);
    }
}

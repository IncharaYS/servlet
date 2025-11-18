package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CoffeeDTO;
import com.xworkz.coffeeApp.DTO.CustomerFeedbackDTO;

public interface CustomerFeedbackService {
    void validateAndSave(CustomerFeedbackDTO customerFeedbackDTO);
}

package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CustomerFeedbackDTO;

public class CustomerFeedbackServiceImpl implements CustomerFeedbackService{
    @Override
    public void validateAndSave(CustomerFeedbackDTO customerFeedbackDTO) {
        System.out.println("Customer feedback service impl overridden method");
        System.out.println("Customer feedback details:"+customerFeedbackDTO);
    }
}

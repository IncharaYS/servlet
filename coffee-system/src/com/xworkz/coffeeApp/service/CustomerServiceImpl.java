package com.xworkz.coffeeApp.service;

import com.xworkz.coffeeApp.DTO.CustomerDTO;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public void validateAndSave(CustomerDTO customerDTO) {
        System.out.println("Customer service impl overridden method");
        System.out.println("Customer details:"+customerDTO);
    }
}

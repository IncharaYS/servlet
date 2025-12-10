package com.xworkz.medicalapp.service;

import com.xworkz.medicalapp.dto.CustomerDTO;
import com.xworkz.medicalapp.dto.SearchDTO;

import java.util.Optional;

public interface MedicalStoreService {
    boolean validateAndSave(CustomerDTO customerDTO);

    Optional<CustomerDTO> validateAndSearchByEmail(SearchDTO searchDTO);
}

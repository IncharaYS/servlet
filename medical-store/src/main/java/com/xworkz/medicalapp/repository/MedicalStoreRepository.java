package com.xworkz.medicalapp.repository;

import com.xworkz.medicalapp.dto.CustomerDTO;
import com.xworkz.medicalapp.dto.SearchDTO;

import java.util.Optional;

public interface MedicalStoreRepository {

    boolean save(CustomerDTO customerDTO);


    default boolean checkDuplicateEmail(String email) {
        return false;
    }

    Optional<CustomerDTO> findByEmail(SearchDTO searchDTO);
}

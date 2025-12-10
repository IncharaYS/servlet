package com.xworkz.medicalapp.service;

import com.xworkz.medicalapp.dto.CustomerDTO;
import com.xworkz.medicalapp.dto.SearchDTO;
import com.xworkz.medicalapp.exceptions.DataInvalidException;
import com.xworkz.medicalapp.exceptions.DataNotSavedException;
import com.xworkz.medicalapp.repository.MedicalStoreRepository;
import com.xworkz.medicalapp.repository.MedicalStoreRepositoryImpl;

import java.util.Optional;

public class MedicalStoreServiceImpl implements MedicalStoreService{


    MedicalStoreRepository medicalStoreRepository=new MedicalStoreRepositoryImpl();


    @Override
    public boolean validateAndSave(CustomerDTO customerDTO) {
        boolean isInvalid=false;
        boolean isDataSaved=false;
        if (customerDTO != null) {
            isInvalid = validateFields(customerDTO, isInvalid);

            if (isInvalid) {
                throw new DataInvalidException("Data must be valid");
            } else {
                if (!(medicalStoreRepository.checkDuplicateEmail(customerDTO.getEmail()))) {
                    boolean isSaved = medicalStoreRepository.save(customerDTO);
                    if(isSaved){
                         System.out.println("Data saved successfully");
                        isDataSaved=true;
                    }
                    else {
                        System.err.println("Data not saved");
                        throw new DataNotSavedException("Failed to save data");
                    }
                } else System.err.println("Duplicate email is present");

            }
        }
        return isDataSaved;
    }



    private static boolean validateFields(CustomerDTO customerDTO, boolean isInvalid) {
        if(customerDTO.getFullName()==null|| customerDTO.getFullName().length()<3){
            System.err.println("Invalid full name entered");
            isInvalid =true;
        }

        else if(customerDTO.getEmail()==null|| customerDTO.getEmail().length()<6){
            System.err.println("Invalid email entered");
            isInvalid =true;
        }

        else if(customerDTO.getPassword()==null|| customerDTO.getPassword().length()<8){
            System.err.println("Invalid password entered");
            isInvalid =true;
        }

        else if(customerDTO.getPhoneNo()<0){
            System.err.println("Invalid phone number entered");
            isInvalid =true;
        }

        else if(customerDTO.getAge()<0){
            System.err.println("Invalid age entered");
            isInvalid =true;
        }


        else {
            System.out.println("All data is valid");
        }
        return isInvalid;
    }


    @Override
    public Optional<CustomerDTO> validateAndSearchByEmail(SearchDTO searchDTO) {
        if (searchDTO.getEmail() == null || searchDTO.getEmail().length() < 6) {
            System.err.println("Invalid email entered");
            return Optional.empty();
        }
        return medicalStoreRepository.findByEmail(searchDTO);
    }
}

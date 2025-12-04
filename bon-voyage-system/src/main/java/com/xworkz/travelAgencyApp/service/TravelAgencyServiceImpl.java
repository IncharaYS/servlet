package com.xworkz.travelAgencyApp.service;

import com.xworkz.travelAgencyApp.dto.TravelAgencyDTO;
import com.xworkz.travelAgencyApp.exceptions.DataInvalidException;
import com.xworkz.travelAgencyApp.exceptions.DataNotSavedException;
import com.xworkz.travelAgencyApp.repository.TravelAgencyRepository;
import com.xworkz.travelAgencyApp.repository.TravelAgencyRepositoryImpl;

public class TravelAgencyServiceImpl implements TravelAgencyService {


    TravelAgencyRepository travelAgencyRepository=new TravelAgencyRepositoryImpl();


    @Override
    public void validateAndSave(TravelAgencyDTO travelAgencyDTO) {


        boolean isInvalid=false;
        if (travelAgencyDTO!=null){
            if(travelAgencyDTO.getFullName()==null||travelAgencyDTO.getFullName().length()<3){
                System.err.println("Invalid full name entered");
                isInvalid=true;
            }

            else if(travelAgencyDTO.getEmail()==null||travelAgencyDTO.getEmail().length()<6){
                System.err.println("Invalid email entered");
                isInvalid=true;
            }

            else if(travelAgencyDTO.getPassword()==null||travelAgencyDTO.getPassword().length()<8){
                System.err.println("Invalid password entered");
                isInvalid=true;
            }

            else if(travelAgencyDTO.getPhoneNo()<0){
                System.err.println("Invalid phone number entered");
                isInvalid=true;
            }

            else if(travelAgencyDTO.getCountry()==null||travelAgencyDTO.getCountry().length()<4){
                System.err.println("Invalid country entered");
                isInvalid=true;
            }


            else {
                System.out.println("All data is valid");
            }



            if (isInvalid) {
                throw new DataInvalidException("Data must be valid");
            }

            else {
                boolean isSaved=travelAgencyRepository.save(travelAgencyDTO);

                if(isSaved) System.out.println("Data saved successfully");
                else {
                    System.err.println("Failed to save data");
                    throw  new DataNotSavedException("Failed to save data");
                }

            }
        }


    }
}

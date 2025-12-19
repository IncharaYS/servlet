package com.xworkz.travel_agency_app.service;

import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;
import com.xworkz.travel_agency_app.exceptions.DataInvalidException;
import com.xworkz.travel_agency_app.exceptions.DataNotSavedException;
import com.xworkz.travel_agency_app.exceptions.DataNotUpdatedException;
import com.xworkz.travel_agency_app.exceptions.DuplicateEmailException;
import com.xworkz.travel_agency_app.repository.TravelAgencyRepository;
import com.xworkz.travel_agency_app.repository.TravelAgencyRepositoryImpl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TravelAgencyServiceImpl implements TravelAgencyService {


    TravelAgencyRepository travelAgencyRepository = new TravelAgencyRepositoryImpl();


    @Override
    public void validateAndSave(TravelAgencyDTO travelAgencyDTO) {


        boolean isInvalid = false;
        if (travelAgencyDTO != null) {
            isInvalid = validateFields(travelAgencyDTO, isInvalid);

            if (isInvalid) {
                throw new DataInvalidException("Data must be valid");
            }

            Optional<TravelAgencyDTO> travelAgencyDTO1=travelAgencyRepository.checkUserExists(travelAgencyDTO.getEmail());

            if(Optional.empty().equals(travelAgencyDTO1)){
                boolean isSaved = travelAgencyRepository.save(travelAgencyDTO);
                if (isSaved) System.out.println("Data saved successfully");
                else {
                    System.err.println("Failed to save data");
                    throw new DataNotSavedException("Failed to save data");
                }
            }
            else {
                System.err.println("Duplicate email is present in db(is_deleted is 1 or 0)");
                if(travelAgencyDTO1.get().getIsDeleted()==0){
                    throw new DuplicateEmailException("Email already exists");
                }
                else {
                    System.out.println("Is deleted=1 is present in deleted list");
                   Optional<TravelAgencyDTO> travelAgencyDTO2= travelAgencyRepository.update(travelAgencyDTO);

                   if(travelAgencyDTO2.isPresent()){
                       System.out.println("Data saved successfully");
                   }
                   else {
                       System.err.println("Failed to save data");
                       throw new DataNotSavedException("Failed to save data");
                   }
                }
            }

        }
    }

    @Override
    public Optional<TravelAgencyDTO> validateAndSearchByEmail(SearchDTO searchDTO) {
        if (searchDTO.getEmail() == null || searchDTO.getEmail().length() < 6) {
            System.err.println("Invalid email entered");
            return Optional.empty();
        }
        return travelAgencyRepository.findByEmail(searchDTO);
    }



    @Override
    public List<TravelAgencyDTO> validateAndSearchByName(SearchDTO searchDTO) {
        if (searchDTO.getName() == null || searchDTO.getName().length() < 3) {
            System.err.println("Invalid name entered");
            return Collections.emptyList();
        }
        return travelAgencyRepository.findByName(searchDTO);
    }

    @Override
    public List<TravelAgencyDTO> validateAndSearchByPhoneNo(SearchDTO searchDTO) {
        if (searchDTO.getPhoneNo() == null || searchDTO.getPhoneNo().length() < 10) {
            System.err.println("Invalid phone number entered");
            return Collections.emptyList();
        }
        return travelAgencyRepository.findByPhoneNo(searchDTO);
    }

    @Override
    public List<TravelAgencyDTO> validateAndSearchByCountry(SearchDTO searchDTO) {
        if (searchDTO.getCountry() == null || searchDTO.getCountry().length() < 3) {
            System.err.println("Invalid country entered");
            return Collections.emptyList();
        }
        return travelAgencyRepository.findByCountry(searchDTO);
    }

    @Override
    public TravelAgencyDTO updateUser(TravelAgencyDTO travelAgencyDTO) {
        boolean isInvalid = false;
        if (travelAgencyDTO != null) {
            isInvalid = TravelAgencyServiceImpl.validateFields(travelAgencyDTO, isInvalid);

            if (isInvalid) {
                throw new DataInvalidException("Data must be valid");
            } else {
                Optional<TravelAgencyDTO> isUpdated = travelAgencyRepository.update(travelAgencyDTO);
                if (isUpdated.isPresent()) {
                    System.out.println("Data updated successfully");
                    System.out.println("Updated data:" + isUpdated);
                    return isUpdated.get();
                } else {
                    System.err.println("Failed to update data");
                    throw new DataNotUpdatedException("Failed to update data");
                }

            }
        }
        return null;
    }

    @Override
    public boolean checkDuplicateEmail(String email) {
        try {
            return travelAgencyRepository.checkDuplicateEmail(email);
        }
        catch (DuplicateEmailException dee){
            return true;
        }
    }

    @Override
    public boolean delete(String email) {


        return travelAgencyRepository.delete(email);
    }

    private static boolean validateFields(TravelAgencyDTO travelAgencyDTO, boolean isInvalid) {
        if(travelAgencyDTO.getFullName()==null|| travelAgencyDTO.getFullName().length()<3){
            System.err.println("Invalid full name entered");
            isInvalid =true;
        }

        else if(travelAgencyDTO.getEmail()==null|| travelAgencyDTO.getEmail().length()<6){
            System.err.println("Invalid email entered");
            isInvalid =true;
        }

        else if(travelAgencyDTO.getPassword()==null|| travelAgencyDTO.getPassword().length()<8){
            System.err.println("Invalid password entered");
            isInvalid =true;
        }

        else if(travelAgencyDTO.getPhoneNo()<0){
            System.err.println("Invalid phone number entered");
            isInvalid =true;
        }

        else if(travelAgencyDTO.getCountry()==null|| travelAgencyDTO.getCountry().length()<4){
            System.err.println("Invalid country entered");
            isInvalid =true;
        }


        else {
            System.out.println("All data is valid");
        }
        return isInvalid;
    }
}

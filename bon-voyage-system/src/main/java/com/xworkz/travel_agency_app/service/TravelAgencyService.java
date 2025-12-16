package com.xworkz.travel_agency_app.service;

import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;

import java.util.List;
import java.util.Optional;

public interface TravelAgencyService {
    void  validateAndSave(TravelAgencyDTO travelAgencyDTO);

    Optional<TravelAgencyDTO> validateAndSearchByEmail(SearchDTO searchDTO);

    List<TravelAgencyDTO> validateAndSearchByName(SearchDTO searchDTO);

    List<TravelAgencyDTO> validateAndSearchByPhoneNo(SearchDTO searchDTO);

    List<TravelAgencyDTO> validateAndSearchByCountry(SearchDTO searchDTO);

    TravelAgencyDTO updateUser(TravelAgencyDTO travelAgencyDTO);

    boolean checkDuplicateEmail(String email);

    boolean delete(String email);
}

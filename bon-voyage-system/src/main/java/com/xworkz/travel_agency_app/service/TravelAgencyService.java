package com.xworkz.travel_agency_app.service;

import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;

import java.util.Optional;

public interface TravelAgencyService {
    void  validateAndSave(TravelAgencyDTO travelAgencyDTO);

    Optional<TravelAgencyDTO> validateAndSearchByEmail(SearchDTO searchDTO);

    TravelAgencyDTO updateUser(TravelAgencyDTO travelAgencyDTO);
}

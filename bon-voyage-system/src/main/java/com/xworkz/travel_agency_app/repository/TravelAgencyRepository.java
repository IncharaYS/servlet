package com.xworkz.travel_agency_app.repository;

import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;

import java.util.Optional;

public interface TravelAgencyRepository {
    boolean save(TravelAgencyDTO travelAgencyDTO);

    default boolean checkDuplicateEmail(String email) {
        return false;
    }

    Optional<TravelAgencyDTO> findByEmail(SearchDTO searchDTO);

    Optional<TravelAgencyDTO> update(TravelAgencyDTO travelAgencyDTO);
}



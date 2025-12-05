package com.xworkz.travel_agency_app.repository;

import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;

public interface TravelAgencyRepository {
    boolean save(TravelAgencyDTO travelAgencyDTO);

    default boolean checkDuplicateEmail(String email) {
        return false;
    }
}



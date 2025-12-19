package com.xworkz.travel_agency_app.repository;

import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface TravelAgencyRepository {
    boolean save(TravelAgencyDTO travelAgencyDTO);

    default boolean checkDuplicateEmail(String email) {
        return false;
    }

    default Optional<TravelAgencyDTO> checkUserExists(String email){
        return Optional.empty();
    }

    default Optional<TravelAgencyDTO> findByEmail(SearchDTO searchDTO){
        return Optional.empty();
    }

    default List<TravelAgencyDTO> findByName(SearchDTO searchDTO){
        return Collections.emptyList();
    }

    default List<TravelAgencyDTO> findByPhoneNo(SearchDTO searchDTO){
        return Collections.emptyList();
    }

    default List<TravelAgencyDTO> findByCountry(SearchDTO searchDTO){
        return Collections.emptyList();
    }

    default Optional<TravelAgencyDTO> update(TravelAgencyDTO travelAgencyDTO){
        return Optional.empty();
    }

    boolean delete(String email);
}



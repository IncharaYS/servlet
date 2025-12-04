package com.xworkz.travelAgencyApp.repository;

import com.xworkz.travelAgencyApp.dto.TravelAgencyDTO;

public interface TravelAgencyRepository {
    boolean save(TravelAgencyDTO travelAgencyDTO);
}

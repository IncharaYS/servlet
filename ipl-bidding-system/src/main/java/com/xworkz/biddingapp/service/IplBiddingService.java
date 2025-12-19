package com.xworkz.biddingapp.service;

import com.xworkz.biddingapp.dto.CompanyDTO;
import com.xworkz.biddingapp.dto.CompanySearchDTO;
import com.xworkz.biddingapp.dto.PlayerDTO;
import com.xworkz.biddingapp.dto.PlayerSearchDTO;
import com.xworkz.biddingapp.exceptions.InvalidDataException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface IplBiddingService {


    default boolean validateAndSave(PlayerDTO playerDTO){
        return false;
    }

    default   Optional<PlayerDTO> validateAndSearchByName(PlayerSearchDTO playerSearchDTO){
        return Optional.empty();
    }

    default   Optional<CompanyDTO> validateAndSearchByEmail(CompanySearchDTO companySearchDTO){
        return Optional.empty();
    }

    default List<PlayerDTO> validateAndSearch(PlayerSearchDTO playerSearchDTO) throws InvalidDataException {
        return Collections.emptyList();
    }


}

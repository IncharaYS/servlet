package com.xworkz.biddingapp.repository;

import com.xworkz.biddingapp.dto.CompanyDTO;
import com.xworkz.biddingapp.dto.CompanySearchDTO;
import com.xworkz.biddingapp.dto.PlayerDTO;
import com.xworkz.biddingapp.dto.PlayerSearchDTO;

import java.util.List;
import java.util.Optional;

public interface IplBiddingRepository {

    default boolean save(PlayerDTO playerDTO){
        return false;
    }

    default Optional<PlayerDTO> findByName(PlayerSearchDTO playerSearchDTO){
       return Optional.empty();
    }


    default Optional<CompanyDTO> findByEmail(CompanySearchDTO companySearchDTO){
        return Optional.empty();
    }

    public List<PlayerDTO> findPlayers(PlayerSearchDTO searchDTO);
}

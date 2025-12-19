package com.xworkz.biddingapp.service;


import com.xworkz.biddingapp.dto.CompanyDTO;
import com.xworkz.biddingapp.dto.CompanySearchDTO;
import com.xworkz.biddingapp.dto.PlayerDTO;
import com.xworkz.biddingapp.dto.PlayerSearchDTO;
import com.xworkz.biddingapp.exceptions.InvalidDataException;
import com.xworkz.biddingapp.repository.IplBiddingRepository;
import com.xworkz.biddingapp.repository.IplBiddingRepositoryImpl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class IplBiddingServiceImpl implements IplBiddingService{

    private static IplBiddingRepository iplBiddingRepository=new IplBiddingRepositoryImpl();

    @Override
    public boolean validateAndSave(PlayerDTO playerDTO){
        boolean isValid=validateFields(playerDTO);

        boolean isSaved=false;
        if(isValid){
            isSaved=iplBiddingRepository.save(playerDTO);
            if(isSaved) System.out.println("Successfully saved data");
            else System.out.println("Failed to save data");
        }
        else {
            System.out.println("Failed to validate data");
        }
        return isSaved;
    }


    @Override
    public Optional<PlayerDTO> validateAndSearchByName(PlayerSearchDTO playerSearchDTO) {
        if (playerSearchDTO.getPlayerName() == null || playerSearchDTO.getPlayerName().length() < 3) {
            System.err.println("Invalid player name entered");
            return Optional.empty();
        }
        return iplBiddingRepository.findByName(playerSearchDTO);
    }

    @Override
    public Optional<CompanyDTO> validateAndSearchByEmail(CompanySearchDTO companySearchDTO) {


        if (companySearchDTO.getEmail() == null || companySearchDTO.getEmail().length() < 3) {
            System.err.println("Invalid email entered");
            return Optional.empty();
        }
        return iplBiddingRepository.findByEmail(companySearchDTO);
    }

    private static boolean validateFields(PlayerDTO playerDTO) {
        boolean isValid=false;
        if(playerDTO.getPlayerName()==null || playerDTO.getPlayerName().length()<10){
            System.err.println("Entered name is invalid");
            return isValid;
        } else if (playerDTO.getPassword()==null || playerDTO.getPassword().length()<8) {
            System.err.println("Entered password is invalid");
            return isValid;
        }
        else if (playerDTO.getAge()<=0) {
            System.err.println("Entered age is invalid");
            return isValid;
        }
        else if (playerDTO.getPlayerType()==null || playerDTO.getPlayerName().length()<3) {
            System.err.println("Selected player type is invalid");
            return isValid;
        }

        else if (playerDTO.getState()==null || playerDTO.getState().length()<3) {
            System.err.println("Entered state is invalid");
            return isValid;
        }
        else if (playerDTO.getBattingAverage()<0) {
            System.err.println("Entered batting average is invalid");
            return isValid;
        }
        else if (playerDTO.getBowlingAverage()<0) {
            System.err.println("Entered bowling average is invalid");
            return isValid;
        }
        else if (playerDTO.getNoOfStumps()<0) {
            System.err.println("Entered number of stumps is invalid");
            return isValid;
        }
        else {
            System.out.println("All data is valid");
            isValid=true;
        }

        return isValid;
    }


    @Override
    public List<PlayerDTO> validateAndSearch(PlayerSearchDTO dto) throws InvalidDataException {

        if (dto.getPlayerType() == null || dto.getPlayerType().trim().isEmpty()) {
            throw new InvalidDataException("Player type is required");
        }

        String type = dto.getPlayerType().trim().toUpperCase();

        switch (type) {

            case "BATTER":
                if (dto.getBattingAverage() <= 0)
                    throw new InvalidDataException("Batting average required");
                break;

            case "BOWLER":
                if (dto.getBowlingAverage() <= 0)
                    throw new InvalidDataException("Bowling average required");
                break;

            case "ALLROUNDER":
                if (dto.getBattingAverage() <= 0 || dto.getBowlingAverage() <= 0)
                    throw new InvalidDataException("Batting & Bowling avg required");
                break;

            case "KEEPER":
                if (dto.getBattingAverage() <= 0 || dto.getNoOfStumps() <= 0)
                    throw new InvalidDataException("Batting avg & stumps required");
                break;

            default:
                throw new InvalidDataException("Invalid player type");
        }

        return iplBiddingRepository.findPlayers(dto);
    }


}

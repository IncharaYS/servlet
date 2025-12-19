package com.xworkz.biddingapp.repository;

import com.xworkz.biddingapp.constants.DbConstants;
import com.xworkz.biddingapp.dto.CompanyDTO;
import com.xworkz.biddingapp.dto.CompanySearchDTO;
import com.xworkz.biddingapp.dto.PlayerDTO;
import com.xworkz.biddingapp.dto.PlayerSearchDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class IplBiddingRepositoryImpl implements IplBiddingRepository{
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }
    }

    @Override
    @SneakyThrows
    public boolean save(PlayerDTO playerDTO){
        boolean isSaved = false;


        String insertQuery = "insert into players(player_name,age,player_type,state,batting_average,bowling_average,no_of_stumps,bid_amount,company,password) values(?,?,?,?,?,?,?,?,?,?);";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(),DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {


            preparedStatement.setString(1, playerDTO.getPlayerName());
            preparedStatement.setInt(2, playerDTO.getAge());
            preparedStatement.setString(3, playerDTO.getPlayerType());
            preparedStatement.setString(4, playerDTO.getState());
            preparedStatement.setDouble(5, playerDTO.getBattingAverage());
            preparedStatement.setDouble(6, playerDTO.getBowlingAverage());
            preparedStatement.setDouble(7, playerDTO.getNoOfStumps());
            preparedStatement.setDouble(8, playerDTO.getBidAmount());
            preparedStatement.setString(9, playerDTO.getCompany());
            preparedStatement.setString(10, playerDTO.getPassword());

            int rows = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted no of rows:" + rows);

            if (rows > 0) isSaved = true;
        }
            return isSaved;
        }


    @Override
    @SneakyThrows
    public Optional<PlayerDTO> findByName(PlayerSearchDTO playerSearchDTO) {



        String searchByNameQuery="select * from  players where player_name=?";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByNameQuery)) {


            checkStatement.setString(1, playerSearchDTO.getPlayerName());

            try (ResultSet playerInfo = checkStatement.executeQuery()) {


                while (playerInfo.next()) {
                    String playerName= playerInfo.getString("player_name");
                    int age= playerInfo.getInt("age");
                    String playerType= playerInfo.getString("player_type");
                    String state= playerInfo.getString("state");
                    double battingAverage= playerInfo.getDouble("batting_average");
                    double bowlingAverage= playerInfo.getDouble("bowling_average");
                    int noOfStumps= playerInfo.getInt("no_of_stumps");
                    double bidAmount= playerInfo.getDouble("bid_amount");
                    String company= playerInfo.getString("company");
                    String password= playerInfo.getString("password");


                    PlayerDTO playerDTO =new PlayerDTO(playerName,password,age,playerType,state,battingAverage,bowlingAverage,noOfStumps,bidAmount,company);
                    return Optional.of(playerDTO);
                }
            }
        }
        return Optional.empty();
    }



    @Override
    @SneakyThrows
    public Optional<CompanyDTO> findByEmail(CompanySearchDTO companySearchDTO) {


        String searchByEmailQuery ="select * from  companies where company_email=?";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByEmailQuery)) {


            checkStatement.setString(1, companySearchDTO.getEmail());

            try (ResultSet companyInfo = checkStatement.executeQuery()) {


                while (companyInfo.next()) {
                    String companyName= companyInfo.getString("company_name");
                    String companyEmail= companyInfo.getString("company_email");
                    String password= companyInfo.getString("password");


                    CompanyDTO companyDTO =new CompanyDTO(companyName,companyEmail,password);
                    return Optional.of(companyDTO);
                }
            }
        }
        return Optional.empty();
    }



    @Override
    @SneakyThrows
    public List<PlayerDTO> findPlayers(PlayerSearchDTO searchDTO) {

        String searchQuery = "select * from players where player_type=? and batting_average>=? and bowling_average>=? and no_of_stumps>=?;";
        try(Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(),DbConstants.USERNAME.getProperties(),DbConstants.PASSWORD.getProperties());
            PreparedStatement preparedStatement = connection.prepareStatement(searchQuery);){

            preparedStatement.setString(1,searchDTO.getPlayerType());
            preparedStatement.setDouble(2,searchDTO.getBattingAverage());
            preparedStatement.setDouble(3,searchDTO.getBowlingAverage());
            preparedStatement.setDouble(4,searchDTO.getNoOfStumps());

            ResultSet resultSet = preparedStatement.executeQuery();

            List<PlayerDTO> playerDTOList = new ArrayList<>();
            while (resultSet.next()){
                String name =  resultSet.getString("player_name");
                int age =   resultSet.getInt("age");
                String  playerType= resultSet.getString("player_type");
                String state = resultSet.getString("state");
                double battingAvg = resultSet.getDouble("batting_average");
                double bowlingAvg = resultSet.getDouble("bowling_average");
                int noOfStumps = resultSet.getInt("no_of_stumps");
                String password = resultSet.getString("password");
                String company = resultSet.getString("company");
                double bidAmount = resultSet.getDouble("bid_amount");

                PlayerDTO playerDTO = new PlayerDTO(name,password,age,playerType,state,battingAvg,bowlingAvg,noOfStumps,bidAmount,company);
                playerDTOList.add(playerDTO);
            }

            return playerDTOList;


        }catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }
}

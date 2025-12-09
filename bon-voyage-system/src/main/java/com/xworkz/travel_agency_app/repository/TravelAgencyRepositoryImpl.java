package com.xworkz.travel_agency_app.repository;

import com.xworkz.travel_agency_app.constants.DbConstants;
import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;
import com.xworkz.travel_agency_app.exceptions.DuplicateEmailException;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class TravelAgencyRepositoryImpl implements TravelAgencyRepository{

    @Override
    public boolean save(TravelAgencyDTO travelAgencyDTO) {
        boolean isSaved = false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }

        String insertQuery = "insert into user_info(full_name,email,password,phone_no,country) values(?,?,?,?,?);";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(),DbConstants.USERNAME.getProperties(),DbConstants.PASSWORD.getProperties());PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){


                preparedStatement.setString(1, travelAgencyDTO.getFullName());
                preparedStatement.setString(2, travelAgencyDTO.getEmail());
                preparedStatement.setString(3, travelAgencyDTO.getPassword());
                preparedStatement.setLong(4, travelAgencyDTO.getPhoneNo());
                preparedStatement.setString(5, travelAgencyDTO.getCountry());


                int rows = preparedStatement.executeUpdate();
                System.out.println("Successfully inserted no of rows:" + rows);


            isSaved = true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return isSaved;
        }

        return  isSaved;
    }




    @Override
    @SneakyThrows
    public boolean checkDuplicateEmail(String email) {
        boolean isDuplicate = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }

        String emailCheckQuery = "select 1 from user_info where email=?";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
                PreparedStatement checkStatement = connection.prepareStatement(emailCheckQuery)) {


                checkStatement.setString(1,email);

                try (ResultSet dupEmail = checkStatement.executeQuery()) {

                    if (dupEmail.next()) {
                        isDuplicate=true;
                        throw new DuplicateEmailException("Entered email is already registered");
                    }
                }
            }
            return isDuplicate;
    }

    @Override
    @SneakyThrows
    public Optional<TravelAgencyDTO> findByEmail(SearchDTO searchDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }


        String searchByEmailQuery="select * from  user_info where email=?;";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByEmailQuery)) {


            checkStatement.setString(1,searchDTO.getEmail());

            try (ResultSet userInfo = checkStatement.executeQuery()) {

                if (userInfo.next()) {
                    String fullName=userInfo.getString("full_name");
                    String email=userInfo.getString("email");
                    String password=userInfo.getString("password");
                    Long phoneNo=userInfo.getLong("phone_no");
                    String country=userInfo.getString("country");


                    TravelAgencyDTO travelAgencyDTO=new TravelAgencyDTO(fullName,email,password,phoneNo,country);


                    System.out.println("Fetched User Info:"+travelAgencyDTO);

                    return Optional.of(travelAgencyDTO);

                }
            }
        }
        return Optional.empty();
    }

    @SneakyThrows
    @Override
    public Optional<TravelAgencyDTO> update(TravelAgencyDTO travelAgencyDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }

        String updateQuery="update user_info set full_name=?,password=?,phone_no=?,country=? where email=?";


        try(Connection connection=DriverManager.getConnection(DbConstants.URL.getProperties(),DbConstants.USERNAME.getProperties(),DbConstants.PASSWORD.getProperties());
        PreparedStatement updateStatement=connection.prepareStatement(updateQuery)){

            updateStatement.setString(1,travelAgencyDTO.getFullName());
            updateStatement.setString(2,travelAgencyDTO.getPassword());
            updateStatement.setLong(3,travelAgencyDTO.getPhoneNo());
            updateStatement.setString(4,travelAgencyDTO.getCountry());
            updateStatement.setString(5,travelAgencyDTO.getEmail());


            int noOfRowsUpdated=updateStatement.executeUpdate();
            System.out.println("No of rows updated:"+noOfRowsUpdated);


            SearchDTO searchDTO=new SearchDTO(travelAgencyDTO.getEmail());
            TravelAgencyRepository travelAgencyRepository=new TravelAgencyRepositoryImpl();
            return travelAgencyRepository.findByEmail(searchDTO);
        }
    }
}



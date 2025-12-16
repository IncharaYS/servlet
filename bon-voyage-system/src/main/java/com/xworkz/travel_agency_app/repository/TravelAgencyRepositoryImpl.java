package com.xworkz.travel_agency_app.repository;

import com.xworkz.travel_agency_app.constants.DbConstants;
import com.xworkz.travel_agency_app.dto.SearchDTO;
import com.xworkz.travel_agency_app.dto.TravelAgencyDTO;
import com.xworkz.travel_agency_app.exceptions.DuplicateEmailException;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TravelAgencyRepositoryImpl implements TravelAgencyRepository{



    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }
    }

    @Override
    public boolean save(TravelAgencyDTO travelAgencyDTO) {
        boolean isSaved = false;



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



        String searchByEmailQuery="select * from  user_info where email=?;";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByEmailQuery)) {


            checkStatement.setString(1,searchDTO.getEmail());

            try (ResultSet userInfo = checkStatement.executeQuery()) {


                while (userInfo.next()) {
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


    @Override
    @SneakyThrows
    public List<TravelAgencyDTO> findByName(SearchDTO searchDTO) {



        String searchByNameQuery ="select * from  user_info where full_name=?;";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByNameQuery)) {


            checkStatement.setString(1,searchDTO.getName());

            try (ResultSet userInfo = checkStatement.executeQuery()) {

                List<TravelAgencyDTO> customerList=new ArrayList<>();

                while (userInfo.next()) {
                    String fullName=userInfo.getString("full_name");
                    String email=userInfo.getString("email");
                    String password=userInfo.getString("password");
                    Long phoneNo=userInfo.getLong("phone_no");
                    String country=userInfo.getString("country");


                    TravelAgencyDTO travelAgencyDTO=new TravelAgencyDTO(fullName,email,password,phoneNo,country);
                    customerList.add(travelAgencyDTO);


                    System.out.println("Fetched User Info:"+travelAgencyDTO);



                }
                return customerList;
            }
        }
    }


    @Override
    @SneakyThrows
    public List<TravelAgencyDTO> findByPhoneNo(SearchDTO searchDTO) {



        String searchByPhoneNoQuery ="select * from  user_info where phone_no=?;";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByPhoneNoQuery)) {


            checkStatement.setString(1,searchDTO.getPhoneNo());

            try (ResultSet userInfo = checkStatement.executeQuery()) {

                List<TravelAgencyDTO> customerList=new ArrayList<>();

                while (userInfo.next()) {
                    String fullName=userInfo.getString("full_name");
                    String email=userInfo.getString("email");
                    String password=userInfo.getString("password");
                    Long phoneNo=userInfo.getLong("phone_no");
                    String country=userInfo.getString("country");


                    TravelAgencyDTO travelAgencyDTO=new TravelAgencyDTO(fullName,email,password,phoneNo,country);
                    customerList.add(travelAgencyDTO);


                    System.out.println("Fetched User Info:"+travelAgencyDTO);



                }
                return customerList;
            }
        }

    }

    @Override
    @SneakyThrows
    public List<TravelAgencyDTO> findByCountry(SearchDTO searchDTO) {



        String searchByCountryQuery ="select * from  user_info where country=?;";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByCountryQuery)) {


            checkStatement.setString(1,searchDTO.getCountry());

            try (ResultSet userInfo = checkStatement.executeQuery()) {

                List<TravelAgencyDTO> customerList=new ArrayList<>();

                while (userInfo.next()) {
                    String fullName=userInfo.getString("full_name");
                    String email=userInfo.getString("email");
                    String password=userInfo.getString("password");
                    Long phoneNo=userInfo.getLong("phone_no");
                    String country=userInfo.getString("country");


                    TravelAgencyDTO travelAgencyDTO=new TravelAgencyDTO(fullName,email,password,phoneNo,country);
                    System.err.println(travelAgencyDTO);
                    customerList.add(travelAgencyDTO);



                }

                System.out.println("Fetched User Info:"+customerList);
                return customerList;
            }
        }
    }




    @SneakyThrows
    @Override
    public Optional<TravelAgencyDTO> update(TravelAgencyDTO travelAgencyDTO) {

 

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


            SearchDTO searchDTO=new SearchDTO(travelAgencyDTO.getEmail(),null,null,null);
            TravelAgencyRepository travelAgencyRepository=new TravelAgencyRepositoryImpl();
            return travelAgencyRepository.findByEmail(searchDTO);
        }
    }
}



package com.xworkz.medicalapp.repository;

import com.xworkz.medicalapp.constants.DbConstants;
import com.xworkz.medicalapp.dto.CustomerDTO;
import com.xworkz.medicalapp.dto.SearchDTO;
import com.xworkz.medicalapp.exceptions.DuplicateEmailException;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class MedicalStoreRepositoryImpl implements MedicalStoreRepository{


    @Override
    public boolean save(CustomerDTO customerDTO) {
        boolean isSaved = false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }



        String insertQuery = "insert into customer_info(full_name,email,password,phone_no,age) values(?,?,?,?,?);";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(),DbConstants.USERNAME.getProperties(),DbConstants.PASSWORD.getProperties());PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)){


            preparedStatement.setString(1, customerDTO.getFullName());
            preparedStatement.setString(2, customerDTO.getEmail());
            preparedStatement.setString(3, customerDTO.getPassword());
            preparedStatement.setLong(4, customerDTO.getPhoneNo());
            preparedStatement.setInt(5, customerDTO.getAge());


            int rows = preparedStatement.executeUpdate();
            System.out.println("Successfully inserted rows:" + rows);

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

        String emailCheckQuery = "select 1 from customer_info where email=?";
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
    public Optional<CustomerDTO> findByEmail(SearchDTO searchDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded ");
        }


        String searchByEmailQuery="select * from  customer_info where email=?;";
        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
             PreparedStatement checkStatement = connection.prepareStatement(searchByEmailQuery)) {


            checkStatement.setString(1,searchDTO.getEmail());

            try (ResultSet userInfo = checkStatement.executeQuery()) {

                if (userInfo.next()) {
                    String fullName=userInfo.getString("full_name");
                    String email=userInfo.getString("email");
                    String password=userInfo.getString("password");
                    long phoneNo=userInfo.getLong("phone_no");
                    int age=userInfo.getInt("age");


                    CustomerDTO customerDTO=new CustomerDTO(fullName,email,password,phoneNo,age);


                    System.out.println("Fetched User Info:"+customerDTO);

                    return Optional.of(customerDTO);

                }
            }
        }
        return Optional.empty();
    }
}

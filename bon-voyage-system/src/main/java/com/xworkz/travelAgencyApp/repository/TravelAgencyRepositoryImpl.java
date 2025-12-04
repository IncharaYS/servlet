package com.xworkz.travelAgencyApp.repository;

import com.xworkz.travelAgencyApp.constants.DbConstants;
import com.xworkz.travelAgencyApp.dto.TravelAgencyDTO;
import com.xworkz.travelAgencyApp.exceptions.DuplicateEmailException;

import java.sql.*;

public class TravelAgencyRepositoryImpl implements TravelAgencyRepository{
    @Override
    public boolean save(TravelAgencyDTO travelAgencyDTO) {
        boolean isSaved = false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(),DbConstants.USERNAME.getProperties(),DbConstants.PASSWORD.getProperties())){

            String emailCheckQuery="select 1 from user_info where email=?";
            try(PreparedStatement checkStatement=connection.prepareStatement(emailCheckQuery)){
                checkStatement.setString(1,travelAgencyDTO.getEmail());

                try(ResultSet dupEmail=checkStatement.executeQuery()){

                    if (dupEmail.next()) {
                        throw new DuplicateEmailException("Entered email is already registered");
                    }}}


            String insertQuery = "insert into user_info(full_name,email,password,phone_no,country) values(?,?,?,?,?);";
            try(PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

                preparedStatement.setString(1, travelAgencyDTO.getFullName());
                preparedStatement.setString(2, travelAgencyDTO.getEmail());
                preparedStatement.setString(3, travelAgencyDTO.getPassword());
                preparedStatement.setLong(4, travelAgencyDTO.getPhoneNo());
                preparedStatement.setString(5, travelAgencyDTO.getCountry());


                int rows = preparedStatement.executeUpdate();
                System.out.println("Successfully inserted no of rows:" + rows);
            }

            isSaved = true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return isSaved;
        }

        return  isSaved;
    }
}

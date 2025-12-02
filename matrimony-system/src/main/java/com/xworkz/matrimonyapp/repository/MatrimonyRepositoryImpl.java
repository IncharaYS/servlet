package com.xworkz.matrimonyapp.repository;

import com.xworkz.matrimonyapp.contants.DbConstants;
import com.xworkz.matrimonyapp.dto.MatrimonyDTO;
import com.xworkz.matrimonyapp.exceptions.DuplicateEmailException;

import java.sql.*;

public class MatrimonyRepositoryImpl implements MatrimonyRepository {
    @Override
    public boolean save(MatrimonyDTO matrimonyDTO) {
        boolean isSaved = false;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        try (Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties())){

            String emailCheckQuery="select 1 from matrimony where email=?";
            try(PreparedStatement checkStatement=connection.prepareStatement(emailCheckQuery)){
            checkStatement.setString(1, matrimonyDTO.getEmail());

            try(ResultSet dupEmail =checkStatement.executeQuery()){

            if (dupEmail.next()) {
                throw new DuplicateEmailException("Entered email is already registered");
            }}}


            String insertQuery = "insert into matrimony(email,create_profile_for,gender,date_of_birth,mother_tongue,religion,marital_status,height) values(?,?,?,?,?,?,?,?);";
            try(PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

                preparedStatement.setString(1, matrimonyDTO.getEmail());
                preparedStatement.setString(2, matrimonyDTO.getCreateProfileFor());
                preparedStatement.setString(3, matrimonyDTO.getGender());
                preparedStatement.setString(4, matrimonyDTO.getDateOfBirth());
                preparedStatement.setString(5, matrimonyDTO.getMotherTongue());
                preparedStatement.setString(6, matrimonyDTO.getReligion());
                preparedStatement.setString(7, matrimonyDTO.getMaritalStatus());
                preparedStatement.setDouble(8, matrimonyDTO.getHeight());


                int rows = preparedStatement.executeUpdate();
                System.out.println("Successfully inserted no of rows:" + rows);
            }

            isSaved = true;

        } catch (SQLException sqle) {
            sqle.printStackTrace();

        }

        return isSaved;
    }

}
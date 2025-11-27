package com.xworkz.matrimonyapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MatrimonyDAO {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/matrimony";
        String userName="root";
        String password="Root@123";

        try {
            Connection connection =DriverManager.getConnection(url, userName, password);
            System.out.println(connection);
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
}

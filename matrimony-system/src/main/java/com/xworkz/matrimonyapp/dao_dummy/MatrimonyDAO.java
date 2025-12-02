package com.xworkz.matrimonyapp.dao_dummy;

import com.xworkz.matrimonyapp.contants.DbConstants;

import java.sql.*;

public class MatrimonyDAO {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/matrimony";
        String userName="root";
        String password="Root@123";

        try {
            Connection connection = DriverManager.getConnection(DbConstants.URL.getProperties(), DbConstants.USERNAME.getProperties(), DbConstants.PASSWORD.getProperties());
            System.out.println("Connection"+connection);

            String insertQuery="insert into matrimony values(1,'incharays07@gmail.com','Brother','Male','21/10/2003','kannada','Hindu','married',5.7);";
            Statement statement=connection.createStatement();

            String insertQuery2="insert into matrimony values(2,'sana@gmail.com','Myself','Female','10/8/2003','kannada','Hindu','Not married',5.3)," +
                    " (3,'sanika@gmail.com','Sister','Female','23/1/2001','hindi','Christian','divorced',5.2)," +
                    " (4,'harish@gmail.com','Brother','Male','2/10/2006','kannada','Hindu','Not married',5.4), " +
                    "(5,'sami@gmail.com','Brother','Male','30/4/2008','kannada','Hindu','Married',5.9);";
            Statement statement2=connection.createStatement();

            String insertQuery3="insert into matrimony values(7,'Manoj@gmail.com','Brother','Male','21/10/2003','kannada','Hindu','married',5.7);";
            Statement statement3=connection.createStatement();

//            int rowsInserted=statement.executeUpdate(insertQuery1);
//            int rowsInserted=statement2.executeUpdate(insertQuery2);
//            int rowsInserted=statement3.executeUpdate(insertQuery3);

//            System.out.println("Rows affected:"+rowsInserted);

            String update1="update matrimony set email='Manoj@gmail.com' where id=7;";

            Statement statement5=connection.createStatement();
            int rowsAffected1= statement5.executeUpdate(update1);
            System.out.println("Rows affected:"+rowsAffected1);

            String table="select * from matrimony;";
            Statement statement4=connection.createStatement();

            ResultSet resultSet =statement4.executeQuery(table);
//            System.out.println(resultSet);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                System.out.println(id);
            }

        }
        catch(SQLException sqle){
            sqle.printStackTrace();
        }

        System.out.println("End of main");
    }
}

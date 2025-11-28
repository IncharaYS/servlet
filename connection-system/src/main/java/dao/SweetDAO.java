package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetDAO {
    public static void main(String[] args) {
        System.out.println("main started");

        String url="jdbc:mysql://localhost:3306/collections";
        String userName="root";
        String password="Root@123";

        try{
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("Connection"+connection);


            String insertQuery="insert into sweet values" +
                    "(1,'Mysorepak',50,'Mysore',true,'30/11/25',30.2)," +
                    "(2,'DharwadPeda',45,'Dharwad',true,'01/12/25',25.5)," +
                    "(3,'Kajjaya',30,'Bengaluru',true,'02/12/25',20.0)," +
                    "(4,'Obbattu',35,'Mysuru',true,'03/12/25',28.4)," +
                    "(5,'Chiroti',40,'Hubli',true,'04/12/25',26.5)," +
                    "(6,'KesariBath',25,'Bengaluru',true,'05/12/25',22.1)," +
                    "(7,'RavaLaddu',20,'Tumkur',true,'06/12/25',18.3)," +
                    "(8,'CoconutBurfi',28,'Udupi',true,'07/12/25',24.0)," +
                    "(9,'MilkCake',32,'Mandya',true,'08/12/25',30.0)," +
                    "(10,'Kunda',55,'Belagavi',true,'09/12/25',34.3)," +
                    "(11,'Jalebi',18,'Bengaluru',true,'10/12/25',15.5)," +
                    "(12,'GulabJamun',25,'Bengaluru',true,'11/12/25',20.0)," +
                    "(13,'Badusha',30,'Mysuru',true,'12/12/25',25.0)," +
                    "(14,'BoondiLaddu',22,'Bengaluru',true,'13/12/25',18.2)," +
                    "(15,'BesanLaddu',24,'Hassan',true,'14/12/25',22.4)," +
                    "(16,'KashiHalwa',48,'Udupi',true,'15/12/25',35.3)," +
                    "(17,'Karjikai',26,'Bengaluru',true,'16/12/25',19.0)," +
                    "(18,'Hayagreeva',20,'Udupi',true,'17/12/25',23.0)," +
                    "(19,'Shankarpali',18,'Hubli',true,'18/12/25',16.0)," +
                    "(20,'PineappleKesari',22,'Bengaluru',true,'19/12/25',24.5)," +
                    "(21,'MandakkiLaddu',15,'Shivamogga',true,'20/12/25',12.0)," +
                    "(22,'AmruthPak',45,'Dharwad',true,'21/12/25',28.0)," +
                    "(23,'DryFruitMysorePak',65,'Mysore',true,'22/12/25',32.5)," +
                    "(24,'PaneerJalebi',55,'Bengaluru',true,'23/12/25',30.0)," +
                    "(25,'NippattuSweet',20,'Tumakuru',true,'24/12/25',15.0)," +
                    "(26,'RoseCake',35,'Bengaluru',true,'25/12/25',22.5)," +
                    "(27,'BananaHalwa',28,'Karwar',true,'26/12/25',26.0)," +
                    "(28,'DryFruitHalwa',60,'Bengaluru',true,'27/12/25',34.0)," +
                    "(29,'ElluUnde',18,'Hassan',true,'28/12/25',16.5)," +
                    "(30,'KobbariMithai',22,'Bengaluru',true,'29/12/25',19.0)," +
                    "(31,'ChennaGulla',25,'Kolar',true,'30/12/25',20.4)," +
                    "(32,'RagiLaddu',20,'Ramanagara',true,'31/12/25',18.0)," +
                    "(33,'UddaGheeLaddu',30,'Mysuru',true,'01/01/26',25.3)," +
                    "(34,'GheeMysorePak',70,'Mysore',true,'02/01/26',35.0)," +
                    "(35,'TilGul',15,'Belagavi',true,'03/01/26',12.0)," +
                    "(36,'KayiHolige',34,'Udupi',true,'04/01/26',22.5)," +
                    "(37,'KayiBarfi',32,'Mangaluru',true,'05/01/26',21.8)," +
                    "(38,'DryFruitBurfi',65,'Bengaluru',true,'06/01/26',33.0)," +
                    "(39,'Basundi',55,'Hubli',true,'07/01/26',40.0)," +
                    "(40,'KesariHalwa',25,'Mysuru',true,'08/01/26',20.0)," +
                    "(41,'ShavigePayasa',20,'Bengaluru',true,'09/01/26',18.0)," +
                    "(42,'RiceHalwa',30,'Udupi',true,'10/01/26',22.0)," +
                    "(43,'JaggeryCake',22,'Mandya',true,'11/01/26',21.4)," +
                    "(44,'RavaKesari',20,'Bengaluru',true,'12/01/26',19.5)," +
                    "(45,'KesarBurfi',55,'Karnataka',true,'13/01/26',30.0)," +
                    "(46,'AnjeerRoll',80,'Bengaluru',true,'14/01/26',34.0)," +
                    "(47,'DryFruitLaddu',40,'Bengaluru',true,'15/01/26',28.0)," +
                    "(48,'JackfruitHalwa',35,'Sirsi',true,'16/01/26',30.0)," +
                    "(49,'BendaUnde',28,'Hassan',true,'17/01/26',19.0)," +
                    "(50,'CoconutLaddu',18,'Mysuru',true,'18/01/26',15.0)," +
                    "(51,'Mandige',55,'Belagavi',true,'19/01/26',35.0)," +
                    "(52,'DoodhPeda',30,'Mandya',true,'20/01/26',24.0)," +
                    "(53,'Halbai',22,'DakshinaKannada',true,'21/01/26',20.0)," +
                    "(54,'Patholi',26,'Udupi',true,'22/01/26',21.0)," +
                    "(55,'RashiUnde',20,'Bengaluru',true,'23/01/26',18.0)," +
                    "(56,'CarrotHalwa',35,'Bengaluru',true,'24/01/26',28.0)," +
                    "(57,'KhovaBurfi',40,'Hubli',true,'25/01/26',30.0)," +
                    "(58,'KhusKhusHalwa',32,'Mysuru',true,'26/01/26',25.0)," +
                    "(59,'TilBurfi',25,'Koppal',true,'27/01/26',21.0)," +
                    "(60,'CoconutPayasa',20,'Mangalore',true,'28/01/26',18.0)," +
                    "(61,'PineappleBurfi',30,'Bengaluru',true,'29/01/26',25.0)," +
                    "(62,'DryFruitKunda',70,'Belagavi',true,'30/01/26',35.0)," +
                    "(63,'UradDalHalwa',35,'Bengaluru',true,'31/01/26',27.0)," +
                    "(64,'MangoHalwa',40,'Bengaluru',true,'01/02/26',28.0)," +
                    "(65,'MilkPeda',22,'Mandya',true,'02/02/26',18.0)," +
                    "(66,'HorlicksBarfi',28,'Bengaluru',true,'03/02/26',20.0)," +
                    "(67,'CocoaBurfi',30,'Bengaluru',true,'04/02/26',22.0)," +
                    "(68,'NellikkayiSweet',25,'Chikkamagalur',true,'05/02/26',19.0)," +
                    "(69,'HoneyLaddu',30,'Bengaluru',true,'06/02/26',22.0)," +
                    "(70,'ElluMithai',18,'Hassan',true,'07/02/26',16.0)," +
                    "(71,'RagiBurfi',20,'Ramanagara',true,'08/02/26',19.0)," +
                    "(72,'VanillaBarfi',25,'Bengaluru',true,'09/02/26',22.0)," +
                    "(73,'ChocolateLaddu',28,'Bengaluru',true,'10/02/26',24.0)," +
                    "(74,'DryFruitRoll',75,'Bengaluru',true,'11/02/26',32.0)," +
                    "(75,'KesariPeda',30,'Mysuru',true,'12/02/26',21.0);";
            
            
            
            Statement statement1=connection.createStatement();
            int noOfRowsAffected=statement1.executeUpdate(insertQuery);
            System.out.println("Number of rows affected is:"+noOfRowsAffected);


            String update2="update sweet set price=130.0 where id=2;";
            Statement statement2=connection.createStatement();
            int noOfRowsAffected2=statement2.executeUpdate(update2);
            System.out.println("Number of rows affected is:"+noOfRowsAffected2);

            String update5 ="update sweet set weight_in_grms=50.0 where sweet_name='MilkPeda';";
            Statement statement8=connection.createStatement();
            int noOfRowsAffected8=statement8.executeUpdate(update5);
            System.out.println("Number of rows affected is:"+noOfRowsAffected8);

            String update3="update sweet set available=false where sweet_name='DryFruitKunda';";
            Statement statement4=connection.createStatement();
            int noOfRowsAffected4=statement4.executeUpdate(update3);
            System.out.println("Number of rows affected is:"+noOfRowsAffected4);

            String update4="update sweet set available=false where price<20;";
            Statement statement5=connection.createStatement();
            int noOfRowsAffected5=statement5.executeUpdate(update4);
            System.out.println("Number of rows affected is:"+noOfRowsAffected5);

            String deleteQuery="delete from sweet where id=56;";
            Statement statement6=connection.createStatement();
            int noOfRowsAffected6=statement6.executeUpdate(deleteQuery);
            System.out.println("Number of rows affected is:"+noOfRowsAffected6);

            String deleteQuery2="delete from sweet where available=false;";
            Statement statement7=connection.createStatement();
            int noOfRowsAffected7=statement7.executeUpdate(deleteQuery2);
            System.out.println("Number of rows affected is:"+noOfRowsAffected7);
    

        }
        catch (SQLException sqle){
            sqle.printStackTrace();
        }

        System.out.println("main ended");
    }
}

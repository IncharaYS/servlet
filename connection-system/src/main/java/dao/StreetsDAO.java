package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetsDAO {
    public static void main(String[] args) {
        System.out.println("main started");

        String url="jdbc:mysql://localhost:3306/collections";
        String userName="root";
        String password="Root@123";

        try{
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("Connection"+connection);
            
            
            String insertQuery="insert into street values" +
                    "(1,'MGRoad','India','Bengaluru','BengaluruUrban','Good',true,true,true,12,1950,12.5,40)," +
                    "(2,'BrigadeRoad','India','Bengaluru','BengaluruUrban','Good',true,true,true,10,1960,10.0,40)," +
                    "(3,'ChurchStreet','India','Bengaluru','BengaluruUrban','Good',true,true,false,8,1970,8.0,30)," +
                    "(4,'CommercialSt','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,9,1980,9.5,35)," +
                    "(5,'ResidencyRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,7,1975,11.0,40)," +
                    "(6,'AvenueRd','India','Bengaluru','BengaluruUrban','Moderate',true,true,false,6,1965,9.0,30)," +
                    "(7,'KRMarketRd','India','Bengaluru','BengaluruUrban','Busy',false,true,false,12,1940,10.0,25)," +
                    "(8,'JayanagarMain','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,1990,14.0,40)," +
                    "(9,'JP NagarRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,1995,13.0,40)," +
                    "(10,'BanashankariRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,1985,15.0,40)," +
                    "(11,'VijayanagarRd','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,6,1992,13.5,35)," +
                    "(12,'RajajinagarRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,7,1988,12.5,40)," +
                    "(13,'MalleshwaramRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,1978,11.5,40)," +
                    "(14,'Indiranagar100','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,2000,16.0,40)," +
                    "(15,'Koramangala80','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,2001,18.0,40)," +
                    "(16,'HSRLayoutRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,2002,17.0,40)," +
                    "(17,'BTMRoad','India','Bengaluru','BengaluruUrban','Good',true,true,true,6,1999,14.0,40)," +
                    "(18,'ElectronicCity1','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,2010,20.0,50)," +
                    "(19,'ElectronicCity2','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,2011,20.0,50)," +
                    "(20,'WhitefieldMain','India','Bengaluru','BengaluruUrban','Good',true,true,true,8,2005,22.0,50)," +
                    "(21,'OuterRingRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,20,2003,45.0,60)," +
                    "(22,'BannerghattaRd','India','Bengaluru','BengaluruUrban','Busy',true,true,true,15,1998,25.0,40)," +
                    "(23,'HosurRoad','India','Bengaluru','BengaluruUrban','Busy',true,true,true,18,1994,30.0,50)," +
                    "(24,'MysoreRoad','India','Bengaluru','BengaluruUrban','Busy',true,true,true,14,1980,28.0,50)," +
                    "(25,'AirportRoad','India','Bengaluru','BengaluruUrban','Good',true,true,true,10,2008,35.0,60)," +
                    "(26,'BellandurRd','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,6,2001,14.0,40)," +
                    "(27,'SarjapurRd','India','Bengaluru','BengaluruUrban','Busy',true,true,true,12,2006,21.0,40)," +
                    "(28,'HebbalFlyover','India','Bengaluru','BengaluruUrban','Good',false,true,true,5,2003,40.0,60)," +
                    "(29,'NagawaraMain','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,2007,18.0,40)," +
                    "(30,'YelahankaRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,1995,20.0,50)," +
                    "(31,'PeenyaRd','India','Bengaluru','BengaluruUrban','Industrial',true,true,true,10,1985,26.0,40)," +
                    "(32,'NayandahalliRd','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,6,1996,18.0,40)," +
                    "(33,'MajesticRd','India','Bengaluru','BengaluruUrban','Busy',true,true,true,12,1970,24.0,30)," +
                    "(34,'CoxTownRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,1978,12.0,30)," +
                    "(35,'FraserTownRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,1977,12.5,35)," +
                    "(36,'UlsoorRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,6,1985,13.0,35)," +
                    "(37,'DomlurRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,6,1993,15.0,40)," +
                    "(38,'MarathahalliRd','India','Bengaluru','BengaluruUrban','Busy',true,true,true,12,2004,24.0,50)," +
                    "(39,'BrookefieldRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,7,2003,18.0,40)," +
                    "(40,'Kadubeesanahalli','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,4,2005,16.0,40)," +
                    "(41,'Kundalahalli','India','Bengaluru','BengaluruUrban','Busy',true,true,true,10,2004,18.0,40)," +
                    "(42,'Garudacharpalya','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,4,2006,14.0,40)," +
                    "(43,'VarthurRd','India','Bengaluru','BengaluruUrban','Busy',true,true,true,8,2009,20.0,40)," +
                    "(44,'KR Puram','India','Bengaluru','BengaluruUrban','Busy',true,true,true,15,2001,25.0,50)," +
                    "(45,'RamamurthyNagar','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,1999,16.0,40)," +
                    "(46,'BanaswadiRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,1990,15.0,40)," +
                    "(47,'HoramavuMain','India','Bengaluru','BengaluruUrban','Good',true,true,true,6,2003,16.0,40)," +
                    "(48,'HennurRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,7,1995,20.0,40)," +
                    "(49,'ThanisandraRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,6,2010,22.0,50)," +
                    "(50,'RTNagarMain','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,1988,14.0,35)," +
                    "(51,'SanjayNagarRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,1991,13.0,35)," +
                    "(52,'NewBELRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,6,1990,18.0,40)," +
                    "(53,'SadashivanagarRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,1985,12.0,30)," +
                    "(54,'YeshwanthpurRd','India','Bengaluru','BengaluruUrban','Busy',true,true,true,10,1980,26.0,40)," +
                    "(55,'KumaraswamyLa','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,1995,12.0,35)," +
                    "(56,'Padmanabhanagar','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,1996,12.5,35)," +
                    "(57,'UttarahalliRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,1994,13.0,35)," +
                    "(58,'RR NagarRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,7,2000,20.0,40)," +
                    "(59,'KengeriMain','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,6,1998,18.0,40)," +
                    "(60,'VijayaBankRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,2002,16.0,40)," +
                    "(61,'ArekereMain','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,2003,14.0,40)," +
                    "(62,'HulimavuMain','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,2001,16.0,40)," +
                    "(63,'GottigereRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,2004,14.0,40)," +
                    "(64,'AnjanapuraRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,2005,16.0,40)," +
                    "(65,'KanakapuraRd','India','Bengaluru','BengaluruUrban','Busy',true,true,true,12,1997,30.0,50)," +
                    "(66,'JP Nagar24','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,1999,14.0,40)," +
                    "(67,'JP Nagar15','India','Bengaluru','BengaluruUrban','Good',true,true,true,3,1998,14.0,40)," +
                    "(68,'BTM16Main','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,2000,16.0,40)," +
                    "(69,'BTM7Main','India','Bengaluru','BengaluruUrban','Good',true,true,true,4,2000,16.0,40)," +
                    "(70,'MarathalliORR','India','Bengaluru','BengaluruUrban','Busy',true,true,true,15,2006,35.0,50)," +
                    "(71,'SilkBoardJnc','India','Bengaluru','BengaluruUrban','Busy',true,true,true,20,1980,30.0,40)," +
                    "(72,'AgaraJnc','India','Bengaluru','BengaluruUrban','Moderate',true,true,true,7,1990,20.0,40)," +
                    "(73,'BellandurGate','India','Bengaluru','BengaluruUrban','Busy',true,true,true,10,1995,22.0,40)," +
                    "(74,'EcospaceRd','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,2007,26.0,40)," +
                    "(75,'RMZEcoWorld','India','Bengaluru','BengaluruUrban','Good',true,true,true,5,2008,28.0,40);";


            Statement statement1=connection.createStatement();
            int noOfRowsAffected1=statement1.executeUpdate(insertQuery);
            System.out.println("Number of rows affected:"+noOfRowsAffected1);

            String update1="update street set width=width+10 where road_condition='Busy';";

            Statement statement2=connection.createStatement();
            int noOfRowsAffected2=statement2.executeUpdate(update1);
            System.out.println("Number of rows affected:"+noOfRowsAffected2);

            String update2="update street set road_condition='Busy' where street_name='HebbalFlyover';";

            Statement statement3=connection.createStatement();
            int noOfRowsAffected3=statement3.executeUpdate(update2);
            System.out.println("Number of rows affected:"+noOfRowsAffected3);

            String update3="update street set has_pavement=true where road_condition in('Busy','Moderate');";

            Statement statement4=connection.createStatement();
            int noOfRowsAffected4=statement4.executeUpdate(update3);
            System.out.println("Number of rows affected:"+noOfRowsAffected4);

            String update4="update street set speed_limit=23 where no_of_signals>10;";

            Statement statement5=connection.createStatement();
            int noOfRowsAffected5=statement5.executeUpdate(update4);
            System.out.println("Number of rows affected:"+noOfRowsAffected5);

            String deleteQuery="delete from street where id=75;";

            Statement statement6=connection.createStatement();
            int noOfRowsAffected6=statement6.executeUpdate(deleteQuery);
            System.out.println("Number of rows affected:"+noOfRowsAffected6);


            String deleteQuery2="delete from street where created_year<2000;";

            Statement statement7=connection.createStatement();
            int noOfRowsAffected7=statement7.executeUpdate(deleteQuery2);
            System.out.println("Number of rows affected:"+noOfRowsAffected7);


        }
        catch (SQLException sqle){
            sqle.printStackTrace();
        }

        System.out.println("main ended");
    }
}

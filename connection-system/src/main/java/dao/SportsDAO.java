package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SportsDAO {
    public static void main(String[] args) {
        System.out.println("main started");

        String url="jdbc:mysql://localhost:3306/collections";
        String userName="root";
        String password="Root@123";

        try{
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("Connection"+connection);



            String insertQuery="insert into sports values" +
                    "(1,'Cricket',11,'India','Outdoor',true,'Chinnaswamy','Medium','BatBall',3.00)," +
                    "(2,'Kabaddi',7,'India','Indoor',true,'Kanteerava','Hard','Mat',1.00)," +
                    "(3,'KhoKho',12,'India','Outdoor',true,'SchoolGround','Medium','None',1.20)," +
                    "(4,'Badminton',2,'India','Indoor',false,'IndoorStadium','Medium','RacketShuttle',0.80)," +
                    "(5,'Tennis',2,'India','Outdoor',false,'TennisCourt','Medium','RacketBall',2.00)," +
                    "(6,'Football',11,'India','Outdoor',true,'FootballGround','Hard','Ball',2.00)," +
                    "(7,'Hockey',11,'India','Outdoor',true,'HockeyGround','Hard','StickBall',1.50)," +
                    "(8,'Volleyball',6,'India','Outdoor',true,'Court','Medium','NetBall',1.00)," +
                    "(9,'Throwball',7,'India','Outdoor',true,'Court','Easy','Ball',1.00)," +
                    "(10,'Basketball',5,'USA','Indoor',true,'IndoorCourt','Hard','Ball',1.50)," +
                    "(11,'TableTennis',2,'India','Indoor',false,'Hall','Easy','BatBall',0.50)," +
                    "(12,'Chess',2,'India','Indoor',false,'Room','Hard','Board',2.00)," +
                    "(13,'Carrom',2,'India','Indoor',false,'Room','Easy','Board',0.80)," +
                    "(14,'Swimming',1,'India','Indoor',false,'Pool','Hard','None',1.00)," +
                    "(15,'Running',1,'India','Outdoor',false,'Track','Medium','None',0.70)," +
                    "(16,'Boxing',2,'India','Indoor',false,'Ring','Hard','Gloves',1.00)," +
                    "(17,'Wrestling',2,'India','Indoor',false,'Hall','Hard','Mat',1.20)," +
                    "(18,'Archery',1,'India','Outdoor',false,'Field','Hard','BowArrow',1.00)," +
                    "(19,'Shooting',1,'India','Indoor',false,'Range','Hard','Gun',1.00)," +
                    "(20,'Cycling',1,'India','Outdoor',false,'Track','Medium','Cycle',1.50)," +
                    "(21,'Skating',1,'India','Outdoor',false,'Rink','Medium','Skates',1.00)," +
                    "(22,'Javelin',1,'India','Outdoor',false,'Field','Hard','Javelin',0.50)," +
                    "(23,'Discus',1,'India','Outdoor',false,'Field','Hard','Discus',0.50)," +
                    "(24,'Shotput',1,'India','Outdoor',false,'Field','Hard','Shot',0.40)," +
                    "(25,'LongJump',1,'India','Outdoor',false,'Field','Medium','None',0.30)," +
                    "(26,'HighJump',1,'India','Outdoor',false,'Field','Medium','None',0.30)," +
                    "(27,'Relay',4,'India','Outdoor',true,'Track','Medium','Baton',0.50)," +
                    "(28,'PoleVault',1,'India','Outdoor',false,'Track','Hard','Pole',0.40)," +
                    "(29,'Golf',1,'India','Outdoor',false,'Course','Hard','Clubs',3.00)," +
                    "(30,'Rugby',15,'India','Outdoor',true,'Ground','Hard','Ball',1.50)," +
                    "(31,'Handball',7,'India','Indoor',true,'Court','Medium','Ball',1.00)," +
                    "(32,'Squash',2,'India','Indoor',false,'Court','Hard','Racket',1.00)," +
                    "(33,'IceHockey',6,'Canada','Indoor',true,'Rink','Hard','StickPuck',1.00)," +
                    "(34,'Surfing',1,'India','Outdoor',false,'Beach','Hard','Board',2.00)," +
                    "(35,'Rowing',1,'India','Outdoor',false,'Lake','Medium','Boat',1.00)," +
                    "(36,'Kayaking',1,'India','Outdoor',false,'River','Medium','Kayak',1.20)," +
                    "(37,'Snooker',2,'India','Indoor',false,'Club','Medium','Cue',1.00)," +
                    "(38,'Bowling',1,'India','Indoor',false,'Alley','Easy','Ball',1.00)," +
                    "(39,'Dodgeball',6,'India','Indoor',true,'Hall','Easy','Ball',1.00)," +
                    "(40,'Softball',9,'USA','Outdoor',true,'Field','Medium','BatBall',1.20)," +
                    "(41,'Baseball',9,'USA','Outdoor',true,'Field','Medium','BatBall',2.00)," +
                    "(42,'Fencing',1,'India','Indoor',false,'Hall','Hard','Sword',1.00)," +
                    "(43,'Taekwondo',1,'Korea','Indoor',false,'Hall','Hard','None',1.00)," +
                    "(44,'Karate',1,'Japan','Indoor',false,'Hall','Hard','None',1.00)," +
                    "(45,'Judo',1,'Japan','Indoor',false,'Hall','Hard','None',1.00)," +
                    "(46,'Yoga',1,'India','Indoor',false,'Hall','Easy','Mat',1.00)," +
                    "(47,'Aerobics',1,'India','Indoor',false,'Room','Easy','None',1.00)," +
                    "(48,'Zumba',1,'India','Indoor',false,'Room','Easy','None',1.00)," +
                    "(49,'Gymnastics',1,'India','Indoor',false,'Hall','Hard','Equipment',2.00)," +
                    "(50,'ParaAthletics',1,'India','Outdoor',false,'Track','Medium','None',1.00)," +
                    "(51,'BeachVolleyball',2,'India','Outdoor',true,'Beach','Medium','Ball',1.00)," +
                    "(52,'MountainBiking',1,'India','Outdoor',false,'Trail','Hard','Bike',2.00)," +
                    "(53,'RockClimbing',1,'India','Outdoor',false,'Hill','Hard','Rope',2.00)," +
                    "(54,'TugOfWar',8,'India','Outdoor',true,'Ground','Medium','Rope',0.50)," +
                    "(55,'Petanque',1,'France','Outdoor',false,'Ground','Easy','Balls',1.00)," +
                    "(56,'Kickboxing',1,'India','Indoor',false,'Hall','Hard','Gloves',1.00)," +
                    "(57,'Parkour',1,'India','Outdoor',false,'City','Hard','None',1.00)," +
                    "(58,'UltimateFrisbee',7,'USA','Outdoor',true,'Ground','Medium','Frisbee',1.00)," +
                    "(59,'Darts',1,'UK','Indoor',false,'Bar','Easy','Dartboard',0.30)," +
                    "(60,'Billiards',2,'India','Indoor',false,'Club','Medium','Cue',1.00)," +
                    "(61,'RollerHockey',5,'India','Indoor',true,'Rink','Hard','Skates',1.20)," +
                    "(62,'WaterPolo',7,'India','Indoor',true,'Pool','Hard','Ball',1.00)," +
                    "(63,'RowingDouble',2,'India','Outdoor',true,'Lake','Medium','Boat',1.20)," +
                    "(64,'Sprint200m',1,'India','Outdoor',false,'Track','Medium','None',0.20)," +
                    "(65,'Sprint400m',1,'India','Outdoor',false,'Track','Medium','None',0.40)," +
                    "(66,'Sprint800m',1,'India','Outdoor',false,'Track','Medium','None',0.80)," +
                    "(67,'Marathon',1,'India','Outdoor',false,'City','Hard','None',3.00)," +
                    "(68,'Triathlon',1,'India','Outdoor',false,'City','Hard','Gear',3.00)," +
                    "(69,'Skateboarding',1,'India','Outdoor',false,'Park','Medium','Board',1.00)," +
                    "(70,'FreestyleFootball',1,'India','Outdoor',false,'Street','Medium','Ball',0.80)," +
                    "(71,'SpeedWalking',1,'India','Outdoor',false,'Track','Medium','None',1.00)," +
                    "(72,'KartRacing',1,'India','Outdoor',false,'Track','Hard','Kart',1.20)," +
                    "(73,'Motorsport',1,'India','Outdoor',false,'Track','Hard','Bike',2.00)," +
                    "(74,'RowingQuad',4,'India','Outdoor',true,'Lake','Medium','Boat',1.50)," +
                    "(75,'RelayMedley',4,'India','Outdoor',true,'Track','Medium','Baton',0.50);";


            Statement statement1=connection.createStatement();
            int noOfRowsAffected1=statement1.executeUpdate(insertQuery);
            System.out.println("Number of rows affected:"+noOfRowsAffected1);


            String update1="update sports set type='Outdoor' where no_of_players>10;";

            Statement statement2=connection.createStatement();
            int noOfRowsAffected2=statement2.executeUpdate(update1);
            System.out.println("Number of rows affected:"+noOfRowsAffected2);

            String update2="update sports set difficulty_level='Medium' where is_team_sports=true;";

            Statement statement3=connection.createStatement();
            int noOfRowsAffected3=statement3.executeUpdate(update2);
            System.out.println("Number of rows affected:"+noOfRowsAffected3);

            String update3="update sports set difficulty_level='Medium' where type='Outdoor';";

            Statement statement4=connection.createStatement();
            int noOfRowsAffected4=statement4.executeUpdate(update3);
            System.out.println("Number of rows affected:"+noOfRowsAffected4);

            String update4="update sports set duration_in_hrs=duration_in_hrs+1.0 where no_of_players>10;";

            Statement statement5=connection.createStatement();
            int noOfRowsAffected5=statement5.executeUpdate(update4);
            System.out.println("Number of rows affected:"+noOfRowsAffected5);

            String deleteQuery="delete from sports where id=60;";

            Statement statement6=connection.createStatement();
            int noOfRowsAffected6=statement6.executeUpdate(deleteQuery);
            System.out.println("Number of rows affected:"+noOfRowsAffected6);


            String deleteQuery2="delete from sports where difficulty_level='Easy';";

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

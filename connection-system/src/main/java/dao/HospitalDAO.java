package dao;

import java.sql.*;

public class HospitalDAO {
    public static void main(String[] args) {
        System.out.println("main started");

        String url="jdbc:mysql://localhost:3306/collections";
        String userName="root";
        String password="Root@123";

        try{
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("Connection"+connection);

            
           
            String insertQuery="insert into hospital values" +
                    "(1,'ApolloHosp','Bengaluru',120,300,1995,'Reddy',200,'apollo1@blr.com',12)," +
                    "(2,'FortisHosp','Bengaluru',140,350,2000,'Shetty',250,'fortis1@blr.com',15)," +
                    "(3,'ColumbiaAsia','Bengaluru',110,280,2002,'Nair',180,'ca1@blr.com',10)," +
                    "(4,'NarayanaHrud','Bengaluru',200,600,2001,'DeviShetty',300,'nh1@blr.com',18)," +
                    "(5,'ManipalHosp','Bengaluru',160,400,1998,'Pai',220,'manipal1@blr.com',14)," +
                    "(6,'SparshHosp','Bengaluru',130,320,2005,'Rao',210,'sparsh1@blr.com',11)," +
                    "(7,'AsterCMI','Bengaluru',170,420,2012,'Koshy',260,'aster1@blr.com',16)," +
                    "(8,'BGSGlobal','Bengaluru',180,500,2008,'Swami',270,'bgs1@blr.com',17)," +
                    "(9,'VictoriaHosp','Bengaluru',150,450,1960,'Govt',300,'victoria1@blr.com',20)," +
                    "(10,'BowringHosp','Bengaluru',140,380,1955,'Govt',280,'bowring1@blr.com',18)," +
                    "(11,'KCGeneral','Bengaluru',120,350,1970,'Govt',240,'kcg1@blr.com',15)," +
                    "(12,'ESIHosp','Bengaluru',100,250,1985,'Govt',200,'esi1@blr.com',12)," +
                    "(13,'StJohnsHosp','Bengaluru',180,500,1975,'Joseph',300,'stjohn1@blr.com',18)," +
                    "(14,'HHospital','Bengaluru',160,380,1990,'Hanumanth',210,'hhosp1@blr.com',14)," +
                    "(15,'MedantaHosp','Bengaluru',170,420,2015,'Trehan',260,'medanta1@blr.com',16)," +
                    "(16,'RainbowHosp','Bengaluru',130,300,2013,'Pattan',190,'rainbow1@blr.com',12)," +
                    "(17,'Cloudnine','Bengaluru',110,260,2010,'Reddy',170,'cloud1@blr.com',10)," +
                    "(18,'Motherhood','Bengaluru',120,280,2012,'Shetty',180,'mother1@blr.com',11)," +
                    "(19,'PeopleTree','Bengaluru',140,330,2016,'Paul',200,'ptree1@blr.com',13)," +
                    "(20,'SakraHosp','Bengaluru',160,360,2013,'Murthy',210,'sakra1@blr.com',14)," +
                    "(21,'RamaiahHosp','Bengaluru',180,420,1995,'Ramaiah',260,'ramaiah1@blr.com',17)," +
                    "(22,'KIMS','Bengaluru',150,380,1965,'Govt',250,'kims1@blr.com',16)," +
                    "(23,'JayadevaInst','Bengaluru',200,700,1980,'Govt',350,'jayadeva1@blr.com',18)," +
                    "(24,'NIMHANS','Bengaluru',160,600,1974,'Govt',400,'nimhans1@blr.com',22)," +
                    "(25,'KidwaiHosp','Bengaluru',170,650,1973,'Govt',380,'kidwai1@blr.com',20)," +
                    "(26,'SDSHosp','Bengaluru',120,300,1981,'Govt',210,'sds1@blr.com',14)," +
                    "(27,'RajivGandhi','Bengaluru',150,420,1994,'Govt',260,'rg1@blr.com',16)," +
                    "(28,'KanvaHosp','Bengaluru',100,240,2017,'Kanva',160,'kanva1@blr.com',10)," +
                    "(29,'SpandanaHosp','Bengaluru',110,260,2018,'Rao',180,'spand1@blr.com',12)," +
                    "(30,'OmHosp','Bengaluru',90,200,2015,'Omkar',130,'om1@blr.com',8)," +
                    "(31,'RajShekar','Bengaluru',130,300,2014,'Raj',190,'raj1@blr.com',11)," +
                    "(32,'JananiHosp','Bengaluru',140,310,2011,'Devi',200,'janani1@blr.com',12)," +
                    "(33,'KripaHosp','Bengaluru',120,280,2019,'Kripa',170,'kripa1@blr.com',10)," +
                    "(34,'MedStarHosp','Bengaluru',160,330,2020,'Star',220,'medstar1@blr.com',13)," +
                    "(35,'VydehiHosp','Bengaluru',180,430,2010,'Reddy',260,'vydehi1@blr.com',17)," +
                    "(36,'BhagwanHosp','Bengaluru',140,300,1999,'Bhagwan',200,'bhag1@blr.com',14)," +
                    "(37,'MediHope','Bengaluru',110,260,2013,'Hope',170,'medi1@blr.com',10)," +
                    "(38,'ApolloKids','Bengaluru',90,220,2016,'Reddy',150,'apollo2@blr.com',9)," +
                    "(39,'FortisCircle','Bengaluru',100,240,2017,'Shetty',160,'fortis2@blr.com',10)," +
                    "(40,'AsterWomen','Bengaluru',130,300,2015,'Koshy',180,'aster2@blr.com',12)," +
                    "(41,'CityHospital','Bengaluru',120,260,2009,'Sharma',170,'city1@blr.com',11)," +
                    "(42,'MetroHosp1','Bengaluru',110,250,2011,'Kumar',160,'metro1@blr.com',10)," +
                    "(43,'MetroHosp2','Bengaluru',115,255,2012,'Kumar',165,'metro2@blr.com',10)," +
                    "(44,'MetroHosp3','Bengaluru',118,260,2013,'Kumar',170,'metro3@blr.com',11)," +
                    "(45,'MetroHosp4','Bengaluru',120,270,2014,'Kumar',175,'metro4@blr.com',12)," +
                    "(46,'MetroHosp5','Bengaluru',125,280,2015,'Kumar',180,'metro5@blr.com',12)," +
                    "(47,'MetroHosp6','Bengaluru',130,290,2016,'Kumar',185,'metro6@blr.com',13)," +
                    "(48,'MetroHosp7','Bengaluru',135,300,2017,'Kumar',190,'metro7@blr.com',13)," +
                    "(49,'MetroHosp8','Bengaluru',140,310,2018,'Kumar',200,'metro8@blr.com',14)," +
                    "(50,'MetroHosp9','Bengaluru',145,320,2019,'Kumar',210,'metro9@blr.com',15)," +
                    "(51,'MetroHosp10','Bengaluru',150,330,2020,'Kumar',220,'metro10@blr.com',15)," +
                    "(52,'MetroHosp11','Bengaluru',155,340,2021,'Kumar',230,'metro11@blr.com',16)," +
                    "(53,'MetroHosp12','Bengaluru',160,350,2022,'Kumar',240,'metro12@blr.com',17)," +
                    "(54,'MetroHosp13','Bengaluru',165,360,2023,'Kumar',250,'metro13@blr.com',18)," +
                    "(55,'GreenLife','Bengaluru',100,230,2016,'Rao',150,'green1@blr.com',10)," +
                    "(56,'LifeCare','Bengaluru',110,250,2017,'Shankar',170,'life1@blr.com',11)," +
                    "(57,'CareWell','Bengaluru',130,280,2013,'Nayak',200,'care1@blr.com',12)," +
                    "(58,'WellnessHosp','Bengaluru',120,260,2018,'Mehta',180,'well1@blr.com',11)," +
                    "(59,'PulseHosp','Bengaluru',140,300,2019,'Reddy',210,'pulse1@blr.com',13)," +
                    "(60,'CurisHosp','Bengaluru',150,320,2020,'Patel',220,'curis1@blr.com',14)," +
                    "(61,'HealPlus','Bengaluru',160,340,2021,'Khan',230,'heal1@blr.com',15)," +
                    "(62,'NovaHosp','Bengaluru',170,360,2022,'Nova',240,'nova1@blr.com',16)," +
                    "(63,'GoldCare','Bengaluru',180,380,2023,'Gold',260,'gold1@blr.com',17)," +
                    "(64,'SunshineHosp','Bengaluru',120,260,2015,'Sunny',170,'sun1@blr.com',12)," +
                    "(65,'TrinityHosp','Bengaluru',130,280,2016,'Trin',190,'tri1@blr.com',13)," +
                    "(66,'AltiusHosp','Bengaluru',140,300,2017,'Alt',200,'alt1@blr.com',14)," +
                    "(67,'ReviveHosp','Bengaluru',150,320,2018,'Rev',210,'revive1@blr.com',15)," +
                    "(68,'UnityHosp','Bengaluru',160,340,2019,'Unity',230,'unity1@blr.com',16)," +
                    "(69,'CureCity','Bengaluru',170,360,2020,'Cure',240,'cure1@blr.com',17)," +
                    "(70,'CarePoint','Bengaluru',180,380,2021,'Point',260,'cpoint1@blr.com',18)," +
                    "(71,'MedHub','Bengaluru',150,320,2019,'Hub',210,'mhub1@blr.com',15)," +
                    "(72,'PrimeHosp','Bengaluru',160,330,2020,'Prime',220,'prime1@blr.com',16)," +
                    "(73,'RoyalHosp','Bengaluru',170,350,2021,'Royal',230,'royal1@blr.com',17)," +
                    "(74,'UrbanHosp','Bengaluru',180,370,2022,'Urban',240,'urban1@blr.com',18)," +
                    "(75,'MetroHosp75','Bengaluru',60,120,2015,'Kumar',90,'metro75@blr.com',8);";


            Statement statement1=connection.createStatement();
//            PreparedStatement preparedStatement = connection.prepareStatement("");
//            int noOfRowsAffected1=statement1.executeUpdate(insertQuery);
//            System.out.println("Number of rows affected:"+noOfRowsAffected1);


            String update1="update hospital set email='govt@gmail.com' where owner_name='Govt B'";

//            String update1="update hospital set email='govt@gmail.com' where owner_name='Govt A'";

            String update2="update hospital set email = ? where owner_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update2);
            preparedStatement.setString(1,"apollo1@MBBS.com");
            preparedStatement.setString(2,"Nair");
            int row1 = preparedStatement.executeUpdate();

////            PreparedStatement preparedStatement = connection.prepareStatement(update2);
//            preparedStatement.setString(1,"apollo1@MBBS MS.com");
//            preparedStatement.setString(2,"Shetty");
//            int row2 = preparedStatement.executeUpdate();


            System.out.println("Number of row1 affected:"+row1);
//            System.out.println("Number of row3 affected:"+row2);






            Statement statement2=connection.createStatement();
            int noOfRowsAffected2=statement2.executeUpdate(update1);
            System.out.println("Number of rows affected:"+noOfRowsAffected2);

//            String update2="update hospital set no_of_doctors=no_of_doctors+18 where owner_name='Govt'";

            Statement statement3=connection.createStatement();
//            int noOfRowsAffected3=statement3.executeUpdate(update2);
//            System.out.println("Number of rows affected:"+noOfRowsAffected3);

            String update3="update hospital set capacity=capacity*1.15 where capacity<200";

            Statement statement4=connection.createStatement();
            int noOfRowsAffected4=statement4.executeUpdate(update3);
            System.out.println("Number of rows affected:"+noOfRowsAffected4);


            String update4="update hospital set no_of_nurses=no_of_nurses*1.20 where capacity>300";

            Statement statement5=connection.createStatement();
            int noOfRowsAffected5=statement5.executeUpdate(update4);
            System.out.println("Number of rows affected:"+noOfRowsAffected5);

            String deleteQuery="delete from hospital where id=21;";

            Statement statement6=connection.createStatement();
            int noOfRowsAffected6=statement6.executeUpdate(deleteQuery);
            System.out.println("Number of rows affected:"+noOfRowsAffected6);


            String deleteQuery2="delete from hospital where no_of_departments<10;";

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

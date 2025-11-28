package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentDAO {
    public static void main(String[] args) {
        System.out.println("main started");

        String url="jdbc:mysql://localhost:3306/collections";
        String userName="root";
        String password="Root@123";

        try{
            Connection connection= DriverManager.getConnection(url,userName,password);
            System.out.println("Connection"+connection);


            String insertQuery="insert into president values" +
                    "(1,'ArunKumar','India','Male',58,'01-01-1967','Bengaluru','INC','MA','2015','2020',2015,'Hindu',58,'Bengaluru',500000)," +
                    "(2,'RaviPrasad','India','Male',60,'02-02-1965','Mysuru','BJP','BA','2014','2019',2014,'Hindu',55,'Bengaluru',480000)," +
                    "(3,'LakshmiRao','India','Female',54,'03-03-1971','Hubli','JDS','MBA','2016','2021',2016,'Hindu',62,'Bengaluru',510000)," +
                    "(4,'SureshGowda','India','Male',59,'04-04-1966','Mandya','INC','MA','2017','2022',2017,'Hindu',57,'Bengaluru',495000)," +
                    "(5,'DivyaShetty','India','Female',52,'05-05-1973','Mangalore','BJP','BA','2013','2018',2013,'Hindu',60,'Bengaluru',470000)," +
                    "(6,'HarishRao','India','Male',61,'06-06-1964','Shimoga','INC','MA','2015','2020',2015,'Hindu',59,'Bengaluru',500000)," +
                    "(7,'KiranKumar','India','Male',55,'07-07-1970','Tumkur','JDS','MSc','2016','2021',2016,'Hindu',63,'Bengaluru',505000)," +
                    "(8,'RohiniPatil','India','Female',50,'08-08-1975','Belgaum','INC','BA','2017','2022',2017,'Hindu',56,'Bengaluru',480000)," +
                    "(9,'VijayMenon','India','Male',57,'09-09-1968','Bengaluru','BJP','MBA','2018','2023',2018,'Hindu',61,'Bengaluru',520000)," +
                    "(10,'SavithaG','India','Female',53,'10-10-1972','Hassan','JDS','BCom','2014','2019',2014,'Hindu',58,'Bengaluru',465000)," +
                    "(11,'ManojG','India','Male',60,'11-11-1965','Bellary','INC','BA','2015','2020',2015,'Hindu',55,'Bengaluru',490000)," +
                    "(12,'NandiniR','India','Female',51,'12-12-1974','Raichur','BJP','MA','2016','2021',2016,'Hindu',60,'Bengaluru',495000)," +
                    "(13,'KrishnaB','India','Male',56,'01-01-1969','Kolar','INC','MBA','2017','2022',2017,'Hindu',57,'Bengaluru',500000)," +
                    "(14,'SnehaP','India','Female',49,'02-02-1976','Chitradurga','JDS','BA','2018','2023',2018,'Hindu',58,'Bengaluru',475000)," +
                    "(15,'GirishK','India','Male',62,'03-03-1963','Karwar','INC','MA','2013','2018',2013,'Hindu',59,'Bengaluru',510000)," +
                    "(16,'RakeshB','India','Male',58,'04-04-1967','Udupi','BJP','MBA','2014','2019',2014,'Hindu',61,'Bengaluru',515000)," +
                    "(17,'PoojaS','India','Female',52,'05-05-1973','Gulbarga','INC','BA','2015','2020',2015,'Hindu',56,'Bengaluru',460000)," +
                    "(18,'NikhilG','India','Male',54,'06-06-1971','Vijayapura','JDS','MSc','2016','2021',2016,'Hindu',57,'Bengaluru',490000)," +
                    "(19,'KavithaJ','India','Female',53,'07-07-1972','Bidar','INC','BCom','2017','2022',2017,'Hindu',59,'Bengaluru',470000)," +
                    "(20,'SharathS','India','Male',57,'08-08-1968','Davanagere','BJP','MA','2018','2023',2018,'Hindu',62,'Bengaluru',520000)," +
                    "(21,'MithunR','India','Male',59,'09-09-1966','Chikkamagalur','INC','MBA','2014','2019',2014,'Hindu',55,'Bengaluru',500000)," +
                    "(22,'HariniS','India','Female',51,'10-10-1974','Kodagu','JDS','BA','2015','2020',2015,'Hindu',58,'Bengaluru',465000)," +
                    "(23,'PradeepK','India','Male',60,'11-11-1965','Bagalkot','BJP','MA','2016','2021',2016,'Hindu',59,'Bengaluru',510000)," +
                    "(24,'MeghaU','India','Female',50,'12-12-1975','Gadag','INC','MBA','2017','2022',2017,'Hindu',57,'Bengaluru',475000)," +
                    "(25,'RaghavM','India','Male',61,'01-01-1964','Haveri','JDS','MA','2018','2023',2018,'Hindu',60,'Bengaluru',495000)," +
                    "(26,'AnitaK','India','Female',48,'02-02-1977','Ramanagara','INC','BA','2013','2018',2013,'Hindu',56,'Bengaluru',455000)," +
                    "(27,'SharanyaP','India','Female',49,'03-03-1976','Yadgir','BJP','MBA','2014','2019',2014,'Hindu',58,'Bengaluru',480000)," +
                    "(28,'DineshR','India','Male',57,'04-04-1968','Bengaluru','INC','BCom','2015','2020',2015,'Hindu',57,'Bengaluru',490000)," +
                    "(29,'KarthikS','India','Male',54,'05-05-1971','Tumkur','BJP','MBA','2016','2021',2016,'Hindu',59,'Bengaluru',500000)," +
                    "(30,'PavitraG','India','Female',52,'06-06-1973','Mysuru','INC','BA','2017','2022',2017,'Hindu',58,'Bengaluru',465000)," +
                    "(31,'ArvindN','India','Male',60,'07-07-1965','Mandya','JDS','MA','2018','2023',2018,'Hindu',61,'Bengaluru',510000)," +
                    "(32,'MamathaR','India','Female',49,'08-08-1976','Mangalore','INC','MBA','2013','2018',2013,'Hindu',57,'Bengaluru',455000)," +
                    "(33,'RameshM','India','Male',62,'09-09-1963','Udupi','BJP','BA','2014','2019',2014,'Hindu',56,'Bengaluru',495000)," +
                    "(34,'GeethaS','India','Female',51,'10-10-1974','Shimoga','INC','MA','2015','2020',2015,'Hindu',58,'Bengaluru',470000)," +
                    "(35,'SandeepN','India','Male',59,'11-11-1966','Hubli','JDS','MBA','2016','2021',2016,'Hindu',62,'Bengaluru',520000)," +
                    "(36,'AnanyaP','India','Female',50,'12-12-1975','Belgaum','INC','BA','2017','2022',2017,'Hindu',55,'Bengaluru',450000)," +
                    "(37,'YogeshK','India','Male',61,'01-01-1964','Bidar','BJP','MA','2018','2023',2018,'Hindu',60,'Bengaluru',500000)," +
                    "(38,'MaliniD','India','Female',53,'02-02-1972','Gulbarga','INC','MBA','2014','2019',2014,'Hindu',59,'Bengaluru',480000)," +
                    "(39,'SrikanthJ','India','Male',58,'03-03-1967','Vijayapura','JDS','BA','2015','2020',2015,'Hindu',58,'Bengaluru',475000)," +
                    "(40,'ShilpaR','India','Female',51,'04-04-1974','Raichur','INC','MA','2016','2021',2016,'Hindu',60,'Bengaluru',470000)," +
                    "(41,'PrakashU','India','Male',56,'05-05-1969','Bellary','BJP','MBA','2017','2022',2017,'Hindu',61,'Bengaluru',510000)," +
                    "(42,'RachanaS','India','Female',52,'06-06-1973','Hassan','INC','BA','2018','2023',2018,'Hindu',55,'Bengaluru',460000)," +
                    "(43,'LokeshN','India','Male',60,'07-07-1965','Chikkamagalur','BJP','MA','2013','2018',2013,'Hindu',58,'Bengaluru',490000)," +
                    "(44,'SheetalP','India','Female',48,'08-08-1977','Tumkur','INC','MBA','2014','2019',2014,'Hindu',59,'Bengaluru',475000)," +
                    "(45,'JayaramG','India','Male',62,'09-09-1963','Mysuru','JDS','BCom','2015','2020',2015,'Hindu',56,'Bengaluru',480000)," +
                    "(46,'VeenaK','India','Female',50,'10-10-1975','Mandya','INC','MA','2016','2021',2016,'Hindu',58,'Bengaluru',490000)," +
                    "(47,'AshokR','India','Male',59,'11-11-1966','Mangalore','BJP','MBA','2017','2022',2017,'Hindu',62,'Bengaluru',520000)," +
                    "(48,'RohitaM','India','Female',49,'12-12-1976','Udupi','INC','BA','2018','2023',2018,'Hindu',55,'Bengaluru',455000)," +
                    "(49,'GopinathS','India','Male',61,'01-01-1964','Shimoga','JDS','MA','2013','2018',2013,'Hindu',59,'Bengaluru',500000)," +
                    "(50,'DeepaR','India','Female',52,'02-02-1973','Hubli','INC','MBA','2014','2019',2014,'Hindu',57,'Bengaluru',465000)," +
                    "(51,'RameshB','India','Male',58,'03-03-1967','Belgaum','BJP','BA','2015','2020',2015,'Hindu',61,'Bengaluru',505000)," +
                    "(52,'SandhyaK','India','Female',51,'04-04-1974','Shimoga','INC','MA','2016','2021',2016,'Hindu',58,'Bengaluru',470000)," +
                    "(53,'AjayM','India','Male',60,'05-05-1965','Kolar','BJP','MBA','2017','2022',2017,'Hindu',62,'Bengaluru',515000)," +
                    "(54,'PreethiR','India','Female',49,'06-06-1976','Hassan','INC','BA','2018','2023',2018,'Hindu',56,'Bengaluru',455000)," +
                    "(55,'VikasS','India','Male',57,'07-07-1968','Davanagere','JDS','MA','2013','2018',2013,'Hindu',59,'Bengaluru',480000)," +
                    "(56,'GayathriP','India','Female',50,'08-08-1975','Gadag','INC','MBA','2014','2019',2014,'Hindu',58,'Bengaluru',470000)," +
                    "(57,'MaheshH','India','Male',62,'09-09-1963','Bagalkot','BJP','BA','2015','2020',2015,'Hindu',60,'Bengaluru',510000)," +
                    "(58,'SahanaG','India','Female',51,'10-10-1974','Bidar','INC','MA','2016','2021',2016,'Hindu',57,'Bengaluru',465000)," +
                    "(59,'RajeevJ','India','Male',59,'11-11-1966','Raichur','BJP','MBA','2017','2022',2017,'Hindu',62,'Bengaluru',515000)," +
                    "(60,'Yashaswini','India','Female',52,'12-12-1973','Vijayapura','INC','BA','2018','2023',2018,'Hindu',55,'Bengaluru',450000)," +
                    "(61,'BalajiM','India','Male',60,'01-01-1965','Bellary','JDS','MA','2014','2019',2014,'Hindu',57,'Bengaluru',495000)," +
                    "(62,'AshaP','India','Female',48,'02-02-1977','Gulbarga','INC','MBA','2015','2020',2015,'Hindu',59,'Bengaluru',465000)," +
                    "(63,'Venkatesh','India','Male',62,'03-03-1963','Mysuru','BJP','BA','2016','2021',2016,'Hindu',61,'Bengaluru',500000)," +
                    "(64,'SanjanaB','India','Female',49,'04-04-1976','Mandya','INC','MA','2017','2022',2017,'Hindu',58,'Bengaluru',470000)," +
                    "(65,'RahulS','India','Male',56,'05-05-1969','Chitradurga','JDS','MBA','2018','2023',2018,'Hindu',60,'Bengaluru',510000)," +
                    "(66,'MeenaP','India','Female',53,'06-06-1972','Karwar','INC','BA','2013','2018',2013,'Hindu',56,'Bengaluru',465000)," +
                    "(67,'SujayK','India','Male',58,'07-07-1967','Udupi','BJP','MA','2014','2019',2014,'Hindu',59,'Bengaluru',490000)," +
                    "(68,'ChaitraR','India','Female',52,'08-08-1973','Mangalore','INC','MBA','2015','2020',2015,'Hindu',57,'Bengaluru',475000)," +
                    "(69,'VishalM','India','Male',61,'09-09-1964','Shimoga','BJP','BA','2016','2021',2016,'Hindu',62,'Bengaluru',515000)," +
                    "(70,'AnkitaJ','India','Female',48,'10-10-1977','Hubli','INC','MA','2017','2022',2017,'Hindu',55,'Bengaluru',455000)," +
                    "(71,'SridharK','India','Male',59,'11-11-1966','Belgaum','JDS','MBA','2018','2023',2018,'Hindu',60,'Bengaluru',500000)," +
                    "(72,'RashmiP','India','Female',50,'12-12-1975','Hassan','INC','BA','2013','2018',2013,'Hindu',56,'Bengaluru',460000)," +
                    "(73,'HarshaN','India','Male',58,'01-01-1967','Gulbarga','BJP','MA','2014','2019',2014,'Hindu',59,'Bengaluru',510000)," +
                    "(74,'NayanaS','India','Female',51,'02-02-1974','Bidar','INC','MBA','2015','2020',2015,'Hindu',57,'Bengaluru',470000)," +
                    "(75,'VarunSharma','India','Male',53,'15-12-1971','Bengaluru','INC','BA','2018','2023',2018,'Hindu',56,'Bengaluru',500000);";


            Statement statement1=connection.createStatement();
            int noOfRowsAffected1=statement1.executeUpdate(insertQuery);
            System.out.println("Number of rows affected:"+noOfRowsAffected1);


            String update1="update president set salary=salary*1.10 where elected_year>2017;";

            Statement statement2=connection.createStatement();
            int noOfRowsAffected2=statement2.executeUpdate(update1);
            System.out.println("Number of rows affected:"+noOfRowsAffected2);

            String update2="update president set age=age+1;";

            Statement statement3=connection.createStatement();
            int noOfRowsAffected3=statement3.executeUpdate(update2);
            System.out.println("Number of rows affected:"+noOfRowsAffected3);

            String update3="update president set salary=salary*1.75 where elected_year<2017 and birth_place='Shimoga';";

            Statement statement4=connection.createStatement();
            int noOfRowsAffected4=statement4.executeUpdate(update3);
            System.out.println("Number of rows affected:"+noOfRowsAffected4);

            String update4="update president set religion='Jain' where president_name='DeepaR';";

            Statement statement5=connection.createStatement();
            int noOfRowsAffected5=statement5.executeUpdate(update4);
            System.out.println("Number of rows affected:"+noOfRowsAffected5);

            String deleteQuery="delete from president where id=3;";

            Statement statement6=connection.createStatement();
            int noOfRowsAffected6=statement6.executeUpdate(deleteQuery);
            System.out.println("Number of rows affected:"+noOfRowsAffected6);


            String deleteQuery2="delete from president where age>62;";

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

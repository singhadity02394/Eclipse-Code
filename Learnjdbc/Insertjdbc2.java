package Learnjdbc;
import java.sql.*;
import java.io.*;

public class Insertjdbc2 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");




//creating a connection

            String url ="jdbc:mysql://localhost:3307/youtube";
            String username="root";
            String password ="Sunny123@";

            Connection con = DriverManager.getConnection(url,username,password);

            //create query Dynamic query
            String q ="insert into table1(tName,tCity) values(?,?)";
            //get the PreparedStatemnt object

            PreparedStatement pstmt =con.prepareStatement(q);

            //user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name:  ");
            String name = br.readLine();


            System.out.println("Enter city: ");
            String city = br.readLine();


            //set the values to query
            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();

            System.out.println("Inserted your query...");
            con.close();


        }catch(Exception e){
            e.printStackTrace();
        }






    }

}

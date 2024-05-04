package Learnjdbc;

import java.sql.*;
import java.io.*;

public class StudentT {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");




//creating a connection

            String url ="jdbc:mysql://localhost:3307/anudipsql";
            String username="root";
            String password ="Sunny123@";

            Connection con = DriverManager.getConnection(url,username,password);

            //create query Dynamic query
            String q ="insert into student (StudentId,FirstName,LastName,DateofBirth,Gender,Email,Phone) values(?,?,?,?,?,?,?)";
            //get the PreparedStatemnt object

            PreparedStatement pstmt =con.prepareStatement(q);

            //user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the StudentId:");
            String Std = br.readLine();

            System.out.println("Enter Firstname:  ");
            String Fname = br.readLine();

            System.out.println("Enter Lastname:  ");
            String Lname = br.readLine();

            System.out.println("Dob");
            String dpb = br.readLine();

            System.out.println("Gender:");
            String gender = br.readLine();


            System.out.println("Enter email: ");
            String email = br.readLine();

            System.out.println("Enter phone: ");
            String phone = br.readLine();

            //set the values to query
            pstmt.setString(1,Std);
            pstmt.setString(2,Fname);
            pstmt.setString(3,Lname);
            pstmt.setString(4,dpb);
            pstmt.setString(5,gender);
            pstmt.setString(6,email);
            pstmt.setString(7,phone);

            pstmt.executeUpdate();

            System.out.println("Inserted your query...");
            con.close();


        }catch(Exception e){
            e.printStackTrace();
        }






    }

}

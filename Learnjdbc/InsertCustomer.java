package Learnjdbc;
import java.sql.*;
import java.io.*;
/*
use youtube;
select * from customers;

---structer of table--
+----+------------+------------------+--------------+
| id | name       | email            | phone_number |
+----+------------+------------------+--------------+
|  1 | adi rajput | adi848@gmail.com | 7788990043   |
+----+------------+------------------+--------------+
 */

public class InsertCustomer {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");




//creating a connection

            String url ="jdbc:mysql://localhost:3307/youtube";
            String username="root";
            String password ="Sunny123@";

            Connection con = DriverManager.getConnection(url,username,password);

            //create query Dynamic query
            String q ="insert into customers(name,email, phone_number) values(?,?,?)";
            //get the PreparedStatemnt object

            PreparedStatement pstmt =con.prepareStatement(q);

            //user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name:  ");
            String name = br.readLine();


            System.out.println("Enter email: ");
            String email = br.readLine();

            System.out.println("Enter phone: ");
            String phone = br.readLine();

            //set the values to query
            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setString(3,phone);

            pstmt.executeUpdate();

            System.out.println("Inserted your query...");
            con.close();


        }catch(Exception e){
            e.printStackTrace();
        }






    }

}

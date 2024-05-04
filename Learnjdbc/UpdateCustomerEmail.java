package Learnjdbc;
import java.sql.*;

/*
mysql> select * from customers;
+----+------------+-------------------+--------------+
| id | name       | email             | phone_number |
+----+------------+-------------------+--------------+
|  1 | adi rajput | add0968@gmail.com | 7788990043   |
 */

public class UpdateCustomerEmail {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/youtube";
        String username = "root";
        String password = "Sunny123@";
        //create query
        String query = "UPDATE customers SET email = 'add0968@gmail.com' WHERE id = 1";
//Driver Loaded
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loded:");


        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection is create");

            //create statment ss instence
            Statement ss = con.createStatement();
            int rowaffected = ss.executeUpdate(query);
            if(rowaffected>0){
                System.out.println("Query is Update"+"-->" +" "+rowaffected+"row(s) affected");
            }else{
                System.out.println("Invalid query insert");
            }

            ss.close();
            con.close();

            System.out.println();
            System.out.println("Connection closed succefuly: ");


        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

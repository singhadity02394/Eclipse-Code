package Learnjdbc;

import java.sql.*;

public class ThirdUpdatejava {
    public static void main(String[] args){
        String url ="jdbc:mysql://localhost:3307/mydatabase";
        String username="root";
        String password ="Sunny123@";
        //create query
        // String query ="insert into employess (id,name,jabtitle,salary) values(1,'sunny','fronted',18000);";

        //delet
        String query ="update employess  set jabtitle='javaDevloper', salary=24000 where id = 2";
//Driver Loaded
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loded:");


        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        // Connection is created; con interface
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


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }



    }
}


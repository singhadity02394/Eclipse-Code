package Learnjdbc;
import java.sql.*;

public class FirstJdbc1 {
    public static void main(String[] args){
        String url ="jdbc:mysql://localhost:3307/mydatabase";
        String username="root";
        String password ="Sunny123@";
        //create query
        String query ="Select  * from employess";
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
            //resultset rr instence store query
            ResultSet rr = ss.executeQuery(query);
            //value ko nikalne ke lieai

            while(rr.next()) {
                int id = rr.getInt("id");
                String name = rr.getString("name");
                String jabtitle = rr.getString("jabtitle");
                double salary = rr.getDouble("salary");

                //print
                System.out.println();
                System.out.println("=======================================================================");
                System.out.println("ID " +"->"+ id);
                System.out.println("name" +" ->"+ name);
                System.out.println("job_role " +"->"+ jabtitle);
                System.out.println("salary " + salary);
                System.out.println("==========================================================================");
            }
            rr.close();
            ss.close();
            con.close();

            System.out.println();
            System.out.println("Connection closed succefuly: ");


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }



    }
}

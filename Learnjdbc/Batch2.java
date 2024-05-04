package Learnjdbc;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
/*create table StudentTable(id int primary key,name varchar(20), branch varchar(20));*/




public class Batch2 {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        String url ="jdbc:mysql://localhost:3307/anudipsql";
        String username="root";
        String password ="Sunny123@";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded..");
            System.out.println("-------------");
        }catch(Exception e){
            e.printStackTrace();
        }

            try{


                Connection con = DriverManager.getConnection(url,username,password);
                System.out.println("Connection is create....");
                con.setAutoCommit(false);


                String q = "insert into  StudentTable (id,name,branch) values(?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(q);

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                while(true) {

                    System.out.println("Enter the StudentId:");
                    int std = Integer.parseInt(br.readLine());

                    System.out.println("Enter the name:");
                    String name = br.readLine();

                    System.out.println("Enter the branch:");
                    String branch = br.readLine();

                    pstmt.setInt(1,std);
                    pstmt.setString(2,name);
                    pstmt.setString(3,branch);

                    pstmt.addBatch();

                    System.out.println("Add more value Y/N");
                    String decision = br.readLine();
                    if(decision.toUpperCase().equals("N")){
                        break;
                    }


                }
               pstmt.executeBatch();

                con.commit();
                System.out.println("Batch Execute Successfully:");
                con.close();
                System.out.println("Connection is close:");




            }catch(Exception e){
                e.printStackTrace();

            }
        }
    }






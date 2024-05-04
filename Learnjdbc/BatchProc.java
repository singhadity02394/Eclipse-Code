package Learnjdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;


public class BatchProc {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
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
            // simple method to inser query
           /* Statement stm = con.createStatement();
            stm.addBatch("insert into student (StudentId,FirstName,LastName,DateofBirth,Gender,Email,Phone) values('445','adi','singh','2001/03/02','M','Singhasd23@gmail.com','8899007645')");
            stm.addBatch("insert into student (StudentId,FirstName,LastName,DateofBirth,Gender,Email,Phone) values('446','raja','singh','2001/03/04','M','hffasd23@gmail.com','9151007645')");
            stm.addBatch("insert into student (StudentId,FirstName,LastName,DateofBirth,Gender,Email,Phone) values('447','rohan','singh','2001/03/07','M','jgkkgsd23@gmail.com','8886869645')");

           int[] batchResult= stm.executeBatch();
           con.commit();*/
            //second method prepare stament
            String q = "insert into student (StudentId,FirstName,LastName,DateofBirth,Gender,Email,Phone) values(?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while(true) {

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

                pstmt.setString(1, Std);
                pstmt.setString(2, Fname);
                pstmt.setString(3, Lname);
                pstmt.setString(4, dpb);
                pstmt.setString(5, gender);
                pstmt.setString(6, email);
                pstmt.setString(7, phone);

                pstmt.addBatch();

                System.out.println("Add more value Y/N");
                String decision = br.readLine();
                if(decision.toUpperCase().equals("N")){
                    break;
                }
            }

            int[] batchResult= pstmt.executeBatch();
            con.commit();
            System.out.println("Batch Execute Successfully:");
            con.close();
            System.out.println("Connection is close:");



            

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

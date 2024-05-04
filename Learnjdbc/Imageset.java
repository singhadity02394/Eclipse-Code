package Learnjdbc;
import javax.imageio.stream.FileImageInputStream;
import java.sql.*;
import java.io.*;

public class Imageset {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url ="jdbc:mysql://localhost:3307/youtube";
            String username="root";
            String password ="Sunny123@";

            Connection con = DriverManager.getConnection(url,username,password);

            //create query
            String q = "insert into images(pic) values(?)";
            PreparedStatement pstm = con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("wallpaperflare.com_wallpaper (1).jpg");
            pstm.setBinaryStream(1,fis,fis.available());

            pstm.executeUpdate();

            System.out.println("Inserted img:");





        }catch(Exception e){
            e.printStackTrace();
        }




    }
}

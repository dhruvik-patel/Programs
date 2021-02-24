import java.io.*;
import java.sql.*;

public class ShowImg
{
    public static void main(String[] args) {
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik", "root","root123");
            PreparedStatement ps = con.prepareStatement("select * from Images");
            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                Blob b = rs.getBlob(2);
                byte []barr = b.getBytes(1,(int)b.length());

                FileOutputStream fout = new FileOutputStream("C://Users//Dhruvik//Desktop//All Programs//Advanced JAVA//JDBC//MY SQL//Images//FromSQL.jpg");
                fout.write(barr);
                fout.close();
            }
            System.out.println("Copied It !!");
        }catch(Exception e){System.out.println(e);}
    }
}
import java.io.*;
import java.sql.*;

public class InsertImg
{
    public static void main(String[] args) {
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik", "root", "root123");
            PreparedStatement ps = con.prepareStatement("insert into Images values (?,?)");

            ps.setString(1, "Flower");

            FileInputStream fin = new FileInputStream("C://Users//Dhruvik//Desktop//All Programs//Advanced JAVA//JDBC//MY SQL//Images//D.jpg");
            ps.setBinaryStream(2,fin,fin.available());

            int i = ps.executeUpdate();
            System.out.println(i + "records affected");

        }catch(Exception e){System.out.println(e);}
    }
}
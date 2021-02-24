import java.sql.*;
import java.io.*;

public class InsertFile
{
    public static void main(String[] args) {
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik", "root", "root123");
            PreparedStatement ps = con.prepareStatement("insert into File values (?,?)");
            ps.setInt(1,68);

            File f = new File("C://Users//Dhruvik//Desktop//All Programs//Advanced JAVA//JDBC//MY SQL//Files//D.txt");
            FileReader fr = new FileReader(f);

            ps.setCharacterStream(2,fr,(int)f.length());
            int i =ps.executeUpdate();

            System.out.println(i+" rows affected");
        }catch(Exception e){System.out.println(e);}
    }
}
import java.sql.*;

public class CreateImgTable
{
    public static void main(String[] args) {
        
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik","root","root123");
            Statement s = con.createStatement();
            int i = s.executeUpdate("create table Images(name varchar(20), photo blob)");
            System.out.println(i + "records affected");

        }catch(Exception e){System.out.println(e);}
    }
}
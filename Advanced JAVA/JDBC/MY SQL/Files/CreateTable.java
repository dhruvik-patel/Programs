import java.sql.*;

public class CreateTable
{
    public static void main(String[] args) {
    try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik","root","root123");
        PreparedStatement ps = con.prepareStatement("create table File(id int(3),name longtext)");
        int i = ps.executeUpdate();
        System.out.println("Created");
        
    }catch(Exception e){System.out.println(e);}
}
}
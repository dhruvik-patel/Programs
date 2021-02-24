import java.sql.*;
public class CreateTable
{
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("create table DHRUVIK.images(name varchar2(4000),image BLOB)");
            int i = ps.executeUpdate();
            System.out.println(i + "inserted");
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
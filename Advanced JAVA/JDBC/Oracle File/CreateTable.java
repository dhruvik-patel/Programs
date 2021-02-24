import java.sql.*;
public class CreateTable
{
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("create table DHRUVIK.files(id number(3),name CLOB)");
            int i = ps.executeUpdate();
            System.out.println("Table Created");
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
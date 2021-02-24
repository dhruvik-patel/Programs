import java.sql.*;
import java.io.*;
public class StoreImage
{
    public static void main(String[] args) throws IOException
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("insert into DHRUVIK.images values (?,?)");
            ps.setString(1,"flower");
            FileInputStream is = new FileInputStream("F:\\D.jpg");
            ps.setBinaryStream(2,is,is.available());
            int i = ps.executeUpdate();
            System.out.println("Image Stored");
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
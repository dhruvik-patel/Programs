import java.sql.*;
import java.io.*;
public class RetrieveImage
{
    public static void main(String[] args) throws IOException
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("select * from DHRUVIK.images");
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                Blob b = rs.getBlob(2);
                byte barr[] = b.getBytes(1,(int)b.length());
                FileOutputStream fout = new FileOutputStream("F:\\getIt.jpg");
                fout.write(barr);
                fout.close();
            }
            System.out.println("Got It !!");
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
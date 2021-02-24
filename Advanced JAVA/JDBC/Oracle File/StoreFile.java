import java.sql.*;
import java.io.*;
public class StoreFile
{
    public static void main(String[] args) throws IOException
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("insert into DHRUVIK.files values(?,?)");
            ps.setInt(1,66);
            
            File f = new File("F:\\z.txt");                 // File we want to save
            FileReader fr = new FileReader(f);

            ps.setCharacterStream(2,fr,(int)f.length());   // Convert to Char stream
            int i = ps.executeUpdate();                     // Execute The query update
            System.out.println("File is stored");
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
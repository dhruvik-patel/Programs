import java.sql.*;
import java.io.*;
public class RetrieveFile
{
    public static void main(String[] args) throws IOException
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("select * from DHRUVIK.files");
            ResultSet rs = ps.executeQuery();
            rs.next();

            Clob c = rs.getClob(2);                                 // Get Info of file from Table
            Reader r = c.getCharacterStream();

            FileWriter fw = new FileWriter("F:\\Y.txt");            // File in which we save info we get from table

            int i;
            while((i =r.read())!=-1)                                // Write into file 
            {
                fw.write((char)i);
            }
            fw.close();
            
            System.out.println("Retrieved man!!");
            
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
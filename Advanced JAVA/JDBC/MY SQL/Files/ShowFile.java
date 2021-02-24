import java.sql.*;
import java.io.*;

public class ShowFile
{
    public static void main(String[] args) {
        try{

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik", "root", "root123");
            PreparedStatement ps = con.prepareStatement("select * from file");
            ResultSet rs = ps.executeQuery();
            rs.next();

            Clob c = rs.getClob(2);
            Reader r = c.getCharacterStream();
            
            FileWriter fw = new FileWriter("from SQL");

            int i;
            while((i=r.read())!= -1)
            {
                fw.write((char)i);
            }
            fw.close();

            System.out.println("Done");

        }catch(Exception e){System.out.println(e);}
    }
}
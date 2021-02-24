import java.sql.*;
public class ShowAll
{
        public static void main(String[] args)
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("select * from DHRUVIK.emp2");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            con.close();
        }catch(Exception e){System.out.println(e);} 
    }
}




            // PreparedStatement ps = con.prepareStatement("insert into DHRUVIK.emp2 values(?,?,?)");
            // ps.setInt(1,7);
            // ps.setString(2,"MAHI");
            // ps.setInt(3,35);
import java.sql.*;
public class OracleCon
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String host = "127.0.0.1";              String username = "system";             String pswd = "root123";

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":1521:xe",username,pswd);       // url,username,password
            
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

            String query = "select * from DHRUVIK.emp2";        // DHRUVIK = DB schema  emp2=table

            ResultSet rs = st.executeQuery(query);

            rs.absolute(6);
            System.out.println(rs.getInt("id") +" "+ rs.getString("name")+" "+ rs.getInt("age"));
            // while(rs.next())
            // {
            //     System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            // }
            con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
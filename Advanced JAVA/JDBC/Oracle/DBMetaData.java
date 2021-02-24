import java.sql.*;
public class DBMetaData
{
    public static void main(String[] args) throws SQLException
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Driver Name : " + dbmd.getDriverName());
            System.out.println("Driver Version : " + dbmd.getDriverVersion());
            System.out.println("User Name : " + dbmd.getUserName());
            System.out.println("Database Name : " + dbmd.getDatabaseProductName());
            System.out.println("Database Version : " + dbmd.getDatabaseProductVersion());

            // String table[] = {"TABLE"};
            // ResultSet rs = dbmd.getTables(null,null,null,table);
            // while(rs.next())
            // {
            //     System.out.println(rs.getString(3));
            // }
            // String view[] = {"VIEW"};
            // rs = dbmd.getTables(null,null,null,view);
            // while(rs.next())
            // {
            //     System.out.println(rs.getString(3));
            // }          
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}
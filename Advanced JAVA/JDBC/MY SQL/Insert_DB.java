import java.sql.*;

public class Insert_DB
{
    public static void main(String[] args) {
        
        try{

//          Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik", "root", "root123");
            Statement st = con.createStatement();
            int i = st.executeUpdate("insert into employee values (24, 'Dhaval', 2000)");
            i = st.executeUpdate("insert into employee values (29, 'Nirlep', 25000)");
            i = st.executeUpdate("insert into employee values (75, 'Parth', 24000)");
            System.out.println("Rows Inserted : " + i);
        }catch(Exception e){    System.out.println(e);  }
    }
}
import java.sql.*;  

public class MySQLCon{  

    public static void main(String args[]){  
    try{  
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvik","root","root123");
                //here dhruvik is database name, root is username and root123 is password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from employee");

        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
        con.close();  

    }catch(Exception e){ System.out.println(e);}  
    }  
}
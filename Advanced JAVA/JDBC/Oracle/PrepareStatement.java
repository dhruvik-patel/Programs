import java.io.*;
import java.sql.*;
public class PrepareStatement
{
    public static void main(String[] args) throws IOException
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","root123");
            PreparedStatement ps = con.prepareStatement("insert into DHRUVIK.emp2 values (?,?,?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do{
                System.out.println("Enter id: ");
                int id = Integer.parseInt(br.readLine());
                System.out.println("Enter name: ");
                String name = br.readLine();
                System.out.println("Enter age: ");
                int age = Integer.parseInt(br.readLine());
                ps.setInt(1,id);
                ps.setString(2, name);
                ps.setInt(3,age);
                int i = ps.executeUpdate();
                System.out.println("records inserted");

                System.out.println("Want to insert another record : y/n");
                String ip = br.readLine();
                if(ip.startsWith("n")){
                    break;
                }
            }while(true);
            con.close();
        }catch(Exception e){System.out.println(e);} 
    }
}




            // PreparedStatement ps = con.prepareStatement("insert into DHRUVIK.emp2 values(?,?,?)");
            // ps.setInt(1,7);
            // ps.setString(2,"MAHI");
            // ps.setInt(3,35);
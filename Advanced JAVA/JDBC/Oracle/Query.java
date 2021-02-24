import java.sql.*;

public class Query
{
    public static void main(String[] args) throws Exception
    {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root123");        
        Statement st = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        int i = st.executeUpdate("create table Employee_Detail(employee_number int NOT NULL Primary key,employee_name varchar(50) NOT NULL, department_id int, salary int, department_name varchar(50) NOT NULL)");
        i = st.executeUpdate("Emp_Personal_detail (employee_number int as foreign key, emp_designation varchar(20), basic_salary int, allowance int, hiredate date, phone_number varchar(20), email varchar(25), photo as blob, resume as clob, emp_address varchar(100))");
        
        System.out.println(i+"Tables Created.");
        c.close();
    }
}
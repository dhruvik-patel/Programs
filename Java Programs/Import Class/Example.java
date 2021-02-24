package pack2;
import pack1.Student;
public class Example
{
 public static void main(String[] args)
 {
   Student s1=new Student();
   s1.getName("Dhruvik");
   s1.getNo(68);
   s1.showName();
   s1.showNo();
  
   s1=new Student();
   s1.showName();
   s1.showNo();
 }
}
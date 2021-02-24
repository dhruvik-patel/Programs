public class Example extends Student
{
 public static void main(String[] args)
 {
  Student s=new Student();
  s.setName("Dhruvik");
  s.setRollno(68);
  s.setAge(19);
  
  System.out.println("Name : "+s.getName());
  System.out.println("Age : "+s.getAge());
  System.out.println("Rollno : "+s.getRollno());
 }
}
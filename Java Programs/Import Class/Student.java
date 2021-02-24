package pack1;
public class Student
{
 private int rollNo;
 private String name;
 
 public void getName(String n)
 { name=n; }
 public void getNo(int a)
 { rollNo=a; }
 public void showName()
 { System.out.println("Name : "+name); }
 public void showNo()
 { System.out.println("RollNo : "+rollNo); }

}
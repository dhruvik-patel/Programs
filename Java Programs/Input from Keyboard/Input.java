import java.util.*;
class Example
{
    private int id;
    private String name;
    public void get()
    {
        System.out.println("Enter your name and id : ");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        id=sc.nextInt();
    }
    public void show()
    {
        System.out.println("Name : " + name + " id : " + id);
    }
}
public class Input
{
    public static void main(String []args)
    {
        Example e=new Example();
        e.get();
        e.show();
    }
}

import java.util.*;
class A implements Runnable
{
    public void run()
    {
    System.out.println("Enter length for first Rectangle : ");
    Scanner sc=new Scanner(System.in);
    int l1=sc.nextInt();
    System.out.println("Enter width for first Rectangle : ");
    int b1=sc.nextInt();
    System.out.println("Area of first Rectangle is : "+l1*b1);
    }
}
class B implements Runnable
{
    public void run()
    {
    System.out.println("Enter length for second Rectangle : ");
    Scanner sc=new Scanner(System.in);
    int l2=sc.nextInt();
    System.out.println("Enter width for second Rectangle : ");
    int b2=sc.nextInt();
    System.out.println("Area of second Rectangle is : "+l2*b2);
    }
}
public class Ex
{
    public static void main(String []args)
    {
        Thread a1=new Thread(new A());
        Thread a2=new Thread(new B());
        a1.setPriority(9);
        a2.setPriority(8);
        System.out.println("1:"+a1.getPriority());
        System.out.println("2:"+a2.getPriority());
    //    a1.start();
    //    a2.start();
    }
}

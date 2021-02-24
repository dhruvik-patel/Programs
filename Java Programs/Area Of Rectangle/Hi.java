import java.util.*;
class Area
{
    private int l,b;
    private int A;
    public void get()
    {
        System.out.println("Enter length and breadth : ");
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
    }
    public void cal()
    {
        A=l*b;
    }
    public void show()
    {
        System.out.println("Length : "+l);
        System.out.println("Breadth: "+b);
        System.out.println("Area   : "+A);
    }
}
public class Hi
{
    public static void main(String []args)
    {
        Area a1=new Area();
        a1.get();
        a1.cal();
        a1.show();
    }
}

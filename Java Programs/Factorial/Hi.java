import java.util.*;
class Facto
{
    public int n;
    public int factorial(int x)
    {
        if(x==0)
            return 1;
        else
        {
            int f=x*factorial(x-1);
            return f;
        }
    }
}
public class Hi
{
    public static void main(String []args)
    {
        Facto obj=new Facto();
        System.out.println("<----Well Come Here---->");
        System.out.println("Kripiya number enter kijiye : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=obj.factorial(n);
        System.out.println("Factorial of "+n+" is : "+ans);
        System.out.println("Thanks for using our Service...");
    }
}

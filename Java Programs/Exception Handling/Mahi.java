import java.util.*;
public class Mahi
{
    public static void main(String []args)
    {
        System.out.println("Enter values of c and d : ");
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        try
        {
            if(d==0)
                throw new ArithmeticException();
            System.out.println("Division c/d = "+c/d);
            System.out.println("Have a Nice Day :)");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : "+e.getMessage());
            System.out.println("Dude!We can't divide number by zero...");
            System.out.println("Improve your maths...");
        }
        finally
        {
            System.out.println("Thanks...");
        }
    }
}

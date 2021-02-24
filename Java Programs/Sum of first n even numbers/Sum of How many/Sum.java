import java.util.*;

public class Sum
{
    public static void main(String []args)
    {
        System.out.println("Enter how many numbers : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=x*2-2;
        int s=0;

        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                s=s+i;
            }
        }
        System.out.println("Sum Of First "+x+" Even Natural Numbers : "+s);

    }
}

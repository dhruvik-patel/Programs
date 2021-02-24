import java.util.*;

public class Sum1
{
    public static void main(String []args)
    {
        System.out.println("Enter upto which number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;

        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                s=s+i;
            }
        }
        System.out.println("Sum Of First "+n+" Even Natural Numbers : "+s);

    }
}


import java.util.*;

public class LetterMatching
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1=sc.next();
        System.out.println("Enter String 2: ");
        String str2=sc.next();

        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();
        if(a.length==b.length)
        {   int ctr1=0,ctr2=0;
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<b.length;j++)
                {
                    if(a[i]==b[j] && a[i]!='@' && b[j]!='$')
                    {
                        a[i]='@';
                        b[j]='$';
                    }
                }
            }
            for(int i=0;i<a.length;i++)
            {
                if(a[i]=='@')
                    ctr1++;
                if(b[i]=='$')
                    ctr2++;
            }
            System.out.println(ctr1);
            System.out.println(ctr2);
            if(ctr1==a.length && ctr2==b.length)
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");
        }
        else
            System.out.println("No");
    }
}
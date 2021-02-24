import java.util.*;
public class Shinchan
{
    public static void main(String []args)
    {
        System.out.println("toUpper() And toLower() : ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur favourite String : ");
        String Dora=sc.next();
        System.out.println("String is : "+Dora);

        //To upper and lower
        String nobita=Dora.toLowerCase();
        System.out.println("Lower : "+nobita);
        nobita=Dora.toUpperCase();
        System.out.println("Upper : "+nobita);

        //IndexOf Functions

        String s1="JamesBond";
        System.out.println("Current String Is : "+s1);
        int i=s1.indexOf('B');
        System.out.println("Index is : "+i);        // 5
        i=s1.indexOf('s',3);
        System.out.println("Index is : "+i);        // 4
        i=s1.indexOf("Bon");
        System.out.println("Index is : "+i);        // 5
        i=s1.indexOf("Bon",2);
        System.out.println("index is : "+i);        // 5
        i=s1.lastIndexOf("mes",6);
        System.out.println("Index is : "+i);        // 2
        i=s1.lastIndexOf("sB",3);
        System.out.println("Index is : "+i);        // -1

        //Comparison Function

        String d="DhruviK";
        String D="Dhruvik";
        if(d.equalsIgnoreCase(D))                   // equals()
            System.out.println("Yeh!!!Hahaha...Made For Each Other");
        else
            System.out.println("Ohh!!shit...");

        System.out.println("compareTo() Function : ");
        String i1="India";
        String i2="InDia";
        int i=i1.compareTo(i2);
        if(i==0)
            System.out.println("Strings are same");
        else if(i<0)
            System.out.println("Dictionary Order");
        else
            System.out.println("Dictionary Opposite Order");


            System.out.println("Thanks For Using My CoDe...May you have a great day...");
    }
}

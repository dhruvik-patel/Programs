import java.util.*;
public class PrintToken
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String []ans = str.split("[^A-Za-z]+");
        if(str=="" || str.trim().equals(""))
        {
            System.out.println("0");
        }
        else if(str.length()>400000)
        {
            return;
        }
        else
        {
            System.out.println(ans.length);
        }
        for(String s : ans)
            System.out.println(s);
        sc.close();
    }
}
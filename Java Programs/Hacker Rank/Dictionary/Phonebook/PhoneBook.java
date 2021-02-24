//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class PhoneBook{
    public static void main(String []args)
    {
        System.out.println("How many names you want to add in phonebook : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Integer> phonebook = new HashMap<String,Integer>();

        System.out.println("Enter name and number : ");
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name,phone);
        }
        while(in.hasNext())
        {
            String s = in.next();
            if(phonebook.containsKey(s))
            {
                System.out.println(s+"="+phonebook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}
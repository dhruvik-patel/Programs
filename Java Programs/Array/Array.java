import java.util.*;
class Array
{
    public static void main(String []args)
    {
        int arr[]=new int[5];
        System.out.println("Give me 5 values , Please!");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++)
        {
            System.out.println("arr["+i+"] : "+arr[i]);
        }
    }
}

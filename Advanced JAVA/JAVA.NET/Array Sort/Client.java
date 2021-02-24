import java.io.*;
import java.net.*;
import java.util.*;

public class Client
{
    public static void main(String[] args)
    {
        try{
                Socket socket = new Socket("localhost",6666);
                Scanner sc = new Scanner(System.in);
                
                DataInputStream din = new DataInputStream(socket.getInputStream());
                DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

                int arr[] = new int[6];
                System.out.println("Enter 6 values : ");
                for(int i=0;i<6;i++)
                {
                    arr[i] = sc.nextInt();
                }
                for(int i=0;i<6;i++)
                {
                    dout.writeInt(arr[i]);
                    dout.flush();
                }
                
                System.out.println("Sorted Array :\n");
                int j=0;
                while(j<6)
                {
                    arr[j] = din.readInt();
                    System.out.println(arr[j]);
                }

                din.close();
                sc.close();
                socket.close();
            }catch(Exception e){System.out.println(e);}

        
    }
}
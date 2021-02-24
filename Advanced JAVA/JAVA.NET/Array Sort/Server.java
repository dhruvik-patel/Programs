import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server
{
    public static void main(String[] args)
    {
        try{
                ServerSocket server = new ServerSocket(6666);
                Socket socket = server.accept();
                
                DataInputStream din = new DataInputStream(socket.getInputStream());
                DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

                int arr[] = new int[6];
                int i=0;
                for(i=0;i<6;i++)
                {
                    arr[i] = din.readInt();
                    System.out.println(arr[i]);
                }
                
                for(i=0;i<5;i++)
                {
                    for(int j=i+1;j<6;j++)
                    {
                        if(arr[i] > arr[j])
                        {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                // System.out.println("Sorted Array : \n");
                // for(i=0;i<6;i++)
                // {
                //     System.err.println(arr[i]);
                // }
                i=0;
                while(i<6)
                {
                    dout.writeInt(arr[i]);
                    dout.flush();
                    i++;
                }

                din.close();
                socket.close();
            }catch(Exception e){System.out.println(e);}
    }
}
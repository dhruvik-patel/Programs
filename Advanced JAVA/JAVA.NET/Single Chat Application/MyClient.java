import java.util.*;
import java.net.*;
import java.io.*;

public class MyClient
{
    public static void main(String[] args)
    {
        try{

            Socket s = new Socket("localhost",6666);

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);

            String read="", write="";
            while(!read.equals("stop"))
            {
                System.out.println("Write a message to Server : ");
                write = sc.nextLine();
                dout.writeUTF(write);
                dout.flush();
                
                read = din.readUTF();
                System.out.println("Server : " + read);
            }
            din.close();
            sc.close();
            s.close();

        }catch(Exception e){System.out.println(e);}
    }
}
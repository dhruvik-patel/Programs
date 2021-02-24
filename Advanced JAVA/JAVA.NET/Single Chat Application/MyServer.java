import java.util.*;
import java.io.*;
import java.net.*;

public class MyServer
{
    public static void main(String[] args)
    {
        try{
            Scanner sc = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            String read="",write="";
            while(!read.equals("stop"))
            {
                read = din.readUTF();
                System.out.println("Client : "+ read);

                System.out.println("Reply to Client :");
                write = sc.nextLine();
                dout.writeUTF(write);
                dout.flush();
            }
            din.close();
            sc.close();
            s.close();
            ss.close();
        }catch(Exception e){System.out.println(e);}
    }
}
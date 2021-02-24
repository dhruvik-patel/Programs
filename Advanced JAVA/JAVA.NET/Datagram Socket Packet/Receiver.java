import java.io.*;
import java.net.*;
public class Receiver
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds = new DatagramSocket(6666);
        byte buf[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,1024);
        ds.receive(dp);

        String msg = new String(dp.getData(),0,dp.getLength());
        System.out.println(msg);
        ds.close();
    }
}
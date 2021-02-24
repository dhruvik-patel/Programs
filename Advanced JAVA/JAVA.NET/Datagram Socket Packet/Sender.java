import java.io.*;
import java.net.*;
public class Sender
{
    public static void main(String[] args) throws Exception
    {
        
        DatagramSocket ds = new DatagramSocket();
        String msg = "Hello from Sender , Receiver";
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(),ip,6666);
        ds.send(dp);
        ds.close();
    }
}
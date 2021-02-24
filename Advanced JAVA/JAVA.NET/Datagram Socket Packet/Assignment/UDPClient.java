import java.net.*;
import java.util.Scanner;
import java.io.*;
public class UDPClient
{
    public static void main(String[] args) throws Exception 
    {
        
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        String s = sc.next();

        InetAddress ip = InetAddress.getByName("localhost");
        byte []buf = s.getBytes();
        DatagramPacket dp = new DatagramPacket(buf, s.length(),ip,6666);

        ds.send(dp);

        DatagramSocket dss = new DatagramSocket(6668);        
        byte []barr = new byte[1024];
        dp = new DatagramPacket(barr, 1024);
        dss.receive(dp);
        String msg = new String(dp.getData(),0,dp.getLength());
        System.out.println(msg);

        ds.close();
        dss.close();
    }
}
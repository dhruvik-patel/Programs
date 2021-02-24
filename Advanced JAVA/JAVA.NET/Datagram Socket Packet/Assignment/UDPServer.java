import java.net.*;
import java.util.Scanner;
import java.io.*;
public class UDPServer
{
    public static void main(String[] args) throws Exception 
    {
        
        String s[]={"zero","one","two","three","four","five","six","seven","seven","eight","nine"};
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket(6666);
        
        byte[] barr = new byte[1024];
        DatagramPacket dp = new DatagramPacket(barr, 1024);
        ds.receive(dp);

        int i = Integer.parseInt(new String(dp.getData(),0,dp.getLength()));
        
        System.out.println(i);
        InetAddress ip = InetAddress.getByName("localhost");
        
        DatagramPacket d = new DatagramPacket(s[i].getBytes(), s[i].length(),ip,6668);

        ds.send(d);

        ds.close();
        
    }
}

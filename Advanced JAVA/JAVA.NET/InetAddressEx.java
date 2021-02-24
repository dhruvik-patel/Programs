import java.net.InetAddress;

public class InetAddressEx
{
    public static void main(String []args)
    {
        try{
            InetAddress ip = InetAddress.getByName("DP");            //  write DP(192.168.137.1) for this computer,localhost
            System.out.println("IP Address : "+ ip);
            System.out.println("Host Name : "+ ip.getHostName());
            System.out.println("Host Address : "+ip.getHostAddress());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
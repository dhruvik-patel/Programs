import java.io.InputStream;
import java.net.*;
public class URLCon
{
    public static void main(String[] args) {
        try{
        
        URL url = new URL("http://www.ldce.ac.in");
        URLConnection urc= url.openConnection();
        InputStream is = urc.getInputStream();

        int i;
        while((i=is.read()) != -1)
        {
            System.out.print((char)i);
        }
    }catch(Exception e){System.out.println(e);}
    }
}
import java.io.*;
public class FileRead
{
    public static void main(String []args) throws IOException
    {
        FileInputStream f=new FileInputStream("White Wolf.txt");
        int ch;
        while((ch=f.read())!=-1)
        {
            System.out.print((char)ch);
        }
        f.close();
    }
}

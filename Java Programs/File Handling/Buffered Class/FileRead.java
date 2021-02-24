import java.io.*;
public class FileRead
{
    public static void main(String []args) throws IOException
    {
        FileReader gf=new FileReader("Starc.txt");
        BufferedReader bf=new BufferedReader(gf);
        int ch;
        while((ch=bf.read())!=-1)
            System.out.print((char)ch);
        bf.close();
    }
}

import java.io.*;
public class FileWrite
{
    public static void main(String []args) throws IOException
    {
        FileWriter gf=new FileWriter("Starc.txt");
        BufferedWriter bf=new BufferedWriter(gf);
        bf.write("The lone wolf dies but the pack survives...From The Great Ned Starc");
        bf.close();
    }
}

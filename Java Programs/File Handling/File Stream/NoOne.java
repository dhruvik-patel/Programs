import java.io.*;
public class NoOne
{
    public static void main(String []args) throws IOException
    {
        FileOutputStream fout=new FileOutputStream("F:/Java Programs/File Handling/White Wolf.txt");
        String got="You Know Nothing (Jon Snow)";
        char ch[]=got.toCharArray();
        for(int i=0;i<got.length();i++)
        {
            fout.write(ch[i]);
        }
        fout.close();
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryConsecutiveOnes{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int ctr=1;
        int RevCtr=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryNo = Integer.toBinaryString(n);
        System.out.println(binaryNo);
        char binary[] = binaryNo.toCharArray();
        if(n==0)
            ctr=0;
        // for(int i=0;i<binary.length-1;i++)
        // {
        //         int j=i+1;
        //         if(binary[i]=='1' && binary[j]=='1')                      //   443 : 110111011    223  : 11011111
        //             {
        //                 ctr=ctr+1;
        //             }
        //         else if(binary[i]=='0' && binary[j]=='1' && i<binary.length-2 && binary[i+2]=='1')
        //             {
        //                 ctr=ctr+1;    
        //             }
        // }
        for(int i=0;i<binary.length-1;i++)
        {
            if(binary[i]=='1' && binary[i+1]=='0')
                RevCtr++;
            else if(binary[i]=='0' && (binary[i+1]=='0' || binary[i+1]=='1') )
                RevCtr++;
            else if(binary[i]=='0' && (binary[i+1]=='0' || binary[i+1]=='1') && i==binary.length-2)
                RevCtr++;
            else if(binary[i]=='0' && binary[i+1]=='0')
                RevCtr++;
        }
        System.out.println(binary.length-RevCtr);
        scanner.close();
    }
}
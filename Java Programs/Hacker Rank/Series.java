import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double series,newSeries=0;
            for(int j=1;j<=n;j++)
            {
                series = (Math.pow(2,j-1))*b;
                newSeries = newSeries + series; 
                System.out.print(a+(int)newSeries+" ");
            
            }
            System.out.println();
        }
        in.close();
    }
}
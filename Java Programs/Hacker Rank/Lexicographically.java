import java.util.Scanner;

public class Lexicographically {

    public static String getSmallestAndLargest(String s, int k) {

        String temp=s.substring(0,k);
        String largest=temp;
        String smallest=temp;
        for(int i=0;i<s.length();i++)
        {   if(s.length()>=i+k+1)           // Eliminate ArrayIndexOutOfBound
            {
                String t=s.substring(i+1,i+1+k);
                if(largest.compareTo(t)<0)          // Compare lexicographically
                    largest=t; 
            }
            else{
                String t = s.substring(i+1);
                if(largest.compareTo(t)<0)
                    largest=t;
            }
        }
        for(int i=0;i<s.length();i++)
        {   if(s.length()>=i+k+1)
            {
                String x = s.substring(i+1,i+k+1);
                if(smallest.compareTo(x)>0)
                    smallest=x;
            }
            else{
                String x = s.substring(i+1);
                if(largest.compareTo(x)>0)
                    smallest=x;
            }
        }
        
        String ans = smallest+"\n"+largest;
        return ans;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
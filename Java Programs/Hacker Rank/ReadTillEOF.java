import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int j=1;
        s = scan.nextLine();
        System.out.println(j+" "+s);
        while(scan.hasNext())
        {
            s = scan.nextLine();
            j++;
            System.out.println(j+" "+s);
        }
    }
}
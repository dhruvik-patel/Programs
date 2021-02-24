import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass{


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum=-60000;                                                     //  For nagetive values
        int sum1;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                sum1=arr[i][j]+arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j+1]
                    +arr[i+1][j]+arr[i+1][j-1]+arr[i+1][j+1];
                if(sum1>sum){
                    sum=sum1;
                }
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19
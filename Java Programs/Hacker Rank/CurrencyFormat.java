import java.text.NumberFormat;
import java.util.*;
public class CurrencyFormat
{
    static void printCurrency(Locale l,double d)
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);
        String currency = nf.format(d);
        System.out.println(currency + " for the locale "+l);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter Currency Value : ");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();

        printCurrency(Locale.US,d);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String ind = nf.format(d);
        System.out.println(ind+" for the locale "+new Locale("en","IN"));
        printCurrency(Locale.CHINA,d);
        printCurrency(Locale.FRANCE,d);    
    }
}
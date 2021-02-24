import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calender;
//import java.util.Date;
import java.util.*;

public class GetDay
{
    public static void main(String[] args) throws ParseException            
    {                                                                                           // or use try catch block
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date : ");
        String date = sc.nextLine();
        
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        Date dt = format.parse(date);                                           // set date according to format
        DateFormat format1 =new SimpleDateFormat("EEEE");
        String day = format1.format(dt);                                        // return day according to format1
        System.out.println(day);
    }
}
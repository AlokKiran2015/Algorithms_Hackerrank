import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class date {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
    String input_date="day/month/year";
  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
  Date dt1=format1.parse(input_date);
  DateFormat format2=new SimpleDateFormat("EEEE"); 
  String finalDay=format2.format(dt1);
        System.out.println(finalDay);
    }
}


package practice119;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int second;
        int minutes;
        int hours;
        int day;
        String month;
        int year;

        System.out.println("1 : ");
        Date d = new Date();
        System.out.println(d.toString()+"(0.5 ball)");

        System.out.println("4 :");
        GregorianCalendar gc = new GregorianCalendar();
        second = gc.get(Calendar.SECOND);
        minutes = gc.get(Calendar.MINUTE);
        hours = gc.get(Calendar.HOUR);
        day = gc.get(Calendar.DAY_OF_MONTH);
        year = gc.get(Calendar.YEAR);


        String[]months = new DateFormatSymbols().getMonths();
        month=gc.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("ru","RU"));
        System.out.println(hours+": " +minutes+": "+second+". "+day +", "+ month+" "+ year);

        System.out.println("6 : ");
        GregorianCalendar gc2 = new GregorianCalendar();
        Locale loc = new Locale("uk","UA");
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm:ss, dd MMM yyyy",loc);
        System.out.println(sdf.format(gc2.getTime())+"(2.0 ball)");
    }
}

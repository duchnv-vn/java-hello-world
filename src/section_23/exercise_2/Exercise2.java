package exercise_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(createCalendarDateAndParse());
    }

    public static String createCalendarDateAndParse() {
        var NYTimezone = TimeZone.getTimeZone("America/New_York");
        var dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        dateFormat.setTimeZone(NYTimezone);
        var date = new GregorianCalendar(NYTimezone);
        date.set(Calendar.YEAR, 2026);
        date.set(Calendar.MONTH, 11);
        date.set(Calendar.DATE, 25);
        date.set(Calendar.HOUR, 11);
        date.set(Calendar.MINUTE, 30);
        date.set(Calendar.SECOND, 0);

        return dateFormat.format(date.getTime());
    }
}

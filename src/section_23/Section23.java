import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Section23 {
    public static void main(String[] args) throws ParseException {
        // LEGACY DATE
        var date = new Date();
        System.out.println("date: " + date);

        var dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        var formattedDate = dateFormat.format(date);

        // System.out.println("formattedDate: " + formattedDate);

        // DATE PARSING: STRING -> OBJECT
        var dateString = "2025-06-03";
        var date2 = dateFormat.parse(dateString);

        // System.out.println("date2: " + date2);

        // SQL DATE
        var date3 = new java.sql.Date(System.currentTimeMillis());

        // System.out.println("date3: " + date3);

        // CALENDAR
        var gregoCalendar = new GregorianCalendar();
        var currentYear = gregoCalendar.get(Calendar.YEAR);
        var currentMonth = gregoCalendar.get(Calendar.MONTH);
        var currentDate = gregoCalendar.get(Calendar.DATE);

        // System.out.println("currentYear: " + currentYear);
        // System.out.println("currentMonth: " + currentMonth);
        // System.out.println("currentDate: " + currentDate);
    }
}
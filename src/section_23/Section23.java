import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Section23 {
    public static void main(String[] args) throws ParseException {
        // LEGACY DATE
        var date = new Date();

        var dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        var formattedDate = dateFormat.format(date);

        // DATE PARSING: STRING -> OBJECT
        var dateString = "2025-06-03";
        var date2 = dateFormat.parse(dateString);

        // SQL DATE
        var date3 = new java.sql.Date(System.currentTimeMillis());

        // CALENDAR
        var gregoCalendar = new GregorianCalendar();
        var currentYear = gregoCalendar.get(Calendar.YEAR);
        var currentMonth = gregoCalendar.get(Calendar.MONTH);
        var currentDate = gregoCalendar.get(Calendar.DATE);

        // TIMEZONE
        var timezoneIds = TimeZone.getAvailableIDs();
        var dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat2.setTimeZone(TimeZone.getTimeZone("Ameria/New_York"));
        var NYDate = dateFormat2.format(new Date());

        dateFormat2.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        var VNDate = dateFormat2.format(new Date());

        var gregoCalendar2 = new GregorianCalendar(TimeZone.getTimeZone("Ameria/New_York"));

    }
}
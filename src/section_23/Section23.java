import java.text.*;
import java.util.*;
import java.time.*;

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
        dateFormat2.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        var NYDate = dateFormat2.format(new Date());

        dateFormat2.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        var VNDate = dateFormat2.format(new Date());

        var gregoCalendar2 = new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));

        // NEW DATETIME API
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();
        var localDateTime = LocalDateTime.now();
        var zonedDateTime = ZonedDateTime.now();

        var localDate2 = LocalDate.of(2024, Month.JUNE, 5);

        var saigonTZ = ZoneId.of("Asia/Ho_Chi_Minh");
        var zonedDateTime2 = ZonedDateTime.of(2024, 6, 5, 12, 0, 0, 0, saigonTZ);

        var newYorkTZ = ZoneId.of("America/New_York");
        var zonedDateTime3 = ZonedDateTime.of(2024, 6, 5, 12, 0, 0, 0, newYorkTZ);

        System.out.println("zonedDateTime2: " + zonedDateTime2);
        System.out.println("zonedDateTime3: " + zonedDateTime3);
    }
}
import java.text.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

        // NEW TIME API
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();
        var localDateTime = LocalDateTime.now();
        var zonedDateTime = ZonedDateTime.now();

        var localDate2 = LocalDate.of(2024, Month.JUNE, 5);

        var saigonTZ = ZoneId.of("Asia/Ho_Chi_Minh");
        var zonedDateTime2 = ZonedDateTime.of(2024, 6, 5, 12, 0, 0, 0, saigonTZ);

        var newYorkTZ = ZoneId.of("America/New_York");
        var zonedDateTime3 = ZonedDateTime.of(2024, 6, 5, 12, 0, 0, 0, newYorkTZ);
        var zonedDateTime4 = ZonedDateTime.now(newYorkTZ);

        // INSTANT & DURATION & PERIOD
        var instant1 = Instant.ofEpochSecond(10 * 24 * 60 * 60);
        var instant2 = Instant.now();
        var instant3 = instant2.plusSeconds(1);
        var duration = Duration.between(instant2, instant3);

        var localDate3 = localDate.plusMonths(1);
        var period = Period.between(localDate, localDate3);

        var oneYear2Months = Period.of(1, 2, 0);
        var localDate4 = localDate.plus(oneYear2Months);

        // MULTIPLE & DIVISION & NEGATION
        var originDuration = Duration.ofMinutes(30);
        var multipledDuration = originDuration.multipliedBy(3); // 1h30m
        var multipledDuration2 = originDuration.dividedBy(3); // 10m

        var originPeriod = Period.ofDays(2);
        var negatedPeriod = originPeriod.negated();// -2d

        // TRUNCATE
        var duration2 = Duration.ofDays(28).plusHours(6).plusMinutes(59).plusSeconds(29);// PT678H59M29S
        var hourOfDuration2 = duration2.truncatedTo(ChronoUnit.HOURS); // PT678H

        // OFFSET
        var originOffset = ZoneOffset.ofHours(7);
        var destOffset = ZoneOffset.ofHours(-4);

        var originDateTime = ZonedDateTime.now(originOffset);
        var destDateTime = originDateTime.withZoneSameInstant(destOffset);

        // DATETIME FORMATTER
        var dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
        var now = LocalDateTime.now();
        var formattedNow = dateTimeFormatter.format(now);

        var dateString2 = "2024-06-04 18:51:19";
        var parsedDate = LocalDateTime.parse(dateString2, dateTimeFormatter);
    }
}
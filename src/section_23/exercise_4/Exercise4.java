package exercise_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise4 {
    public static String formatDateTime(LocalDateTime localDateTime) {
        var dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy h:mm a");
        return dateFormatter.format(localDateTime);
    }

    public static LocalDateTime parseDateTime(String dateTimeString) {
        var dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        var dateTime = LocalDateTime.parse(dateTimeString, dateFormatter);
        return dateTime;
    }
}

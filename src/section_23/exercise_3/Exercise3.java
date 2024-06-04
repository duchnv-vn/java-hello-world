package exercise_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(localTimeOperations());
    }

    public static LocalDate localDateOperations() {
        var localDate = LocalDate.of(2025, Month.DECEMBER, 25);
        localDate = localDate.plusMonths(6).plusDays(18);
        return localDate;
    }

    public static LocalTime localTimeOperations() {
        var localTime = LocalTime.of(9, 0, 0);
        localTime = localTime.plusHours(8).plusMinutes(15);
        return localTime;

    }

    public static LocalDateTime localDateTimeOperations() {
        var localDateTime = LocalDateTime.of(2025, Month.DECEMBER, 25, 9, 30, 0);
        localDateTime.minusWeeks(4);
        localDateTime.minusMinutes(30);
        return localDateTime;
    }
}

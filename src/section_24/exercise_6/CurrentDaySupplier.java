package section_24.exercise_6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class CurrentDaySupplier {
    public static String getCurrentDayNameSupplier() {
        Supplier<String> getCurrentDayName = () -> DayOfWeek.from(LocalDate.now()).name();
        return getCurrentDayName.get();
    }
}

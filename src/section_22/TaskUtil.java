public class TaskUtil {
    public static int getTaskEstimate(Priority priority) {
        return switch (priority) {
            case URGENT -> 2;
            case HIGH -> 4;
            case MEDIUM -> 6;
            case LOW -> 8;
        };
    }
}

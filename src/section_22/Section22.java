import java.util.EnumSet;

public class Section22 {
    public static void main(String[] args) {
        // ENUM
        int estimateTime = TaskUtil.getTaskEstimate(Priority.MEDIUM);
        Priority lowByName = Priority.valueOf("LOW");
        int lowOrder = lowByName.ordinal();

        Priority lowByOrdinal = Priority.values()[3];
        String lowName = lowByOrdinal.name();
        int lowHour = lowByOrdinal.getHour();
        String lowDesc = lowByOrdinal.getDescription();

        // System.out.println("LOW: " + Priority.LOW);
        // System.out.println("lowOrder: " + lowOrder);
        // System.out.println("lowName: " + lowName);
        // System.out.println("lowHour: " + lowHour);
        // System.out.println("lowDesc: " + lowDesc);

        // ENUM SET
        var allPriorities = EnumSet.allOf(Priority.class);
        allPriorities.forEach(priority -> {
            System.out.println("priority: " + priority);
        });

        var newPriorityEnum1 = EnumSet.of(Priority.HIGH, Priority.MEDIUM, Priority.LOW); // Contain HIGH, MEDIUM, LOW
        var newPriorityEnum2 = EnumSet.range(Priority.HIGH, Priority.LOW); // Contain HIGH, MEDIUM, LOW
        var newPriorityEnum3 = EnumSet.complementOf(newPriorityEnum2); // Contains URGENT
    }
}
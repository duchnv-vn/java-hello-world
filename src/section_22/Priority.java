public enum Priority {
    URGENT(2, "This is urgent-level task"),
    HIGH(4, "This is high-level task"),
    MEDIUM(6, "This is medium-level task"),
    LOW(8, "This is low-level task");

    private int hour;
    private String description;

    Priority(int hour, String description) {
        this.hour = hour;
        this.description = description;
    }

    public int getHour() {
        return hour;
    }

    public String getDescription() {
        return description;
    }
}

package be.gilles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodoItem {

    private final String description;
    private final int priority;
    private final LocalDate deadline;

    public TodoItem(String description, int priority, String date) {
        this.description = description;
        this.priority = priority;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.deadline = LocalDate.parse(date, formatter);
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %s", getPriority(), getDescription(), getDeadline());
    }
}

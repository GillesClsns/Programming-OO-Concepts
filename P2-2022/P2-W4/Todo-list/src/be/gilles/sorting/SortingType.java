package be.gilles.sorting;

import be.gilles.TodoItem;
import be.gilles.comparators.TodoItemComparatorDeadline;
import be.gilles.comparators.TodoItemComparatorDescription;
import be.gilles.comparators.TodoItemComparatorPriority;

import java.util.Comparator;

public enum SortingType {

    DEADLINE(new TodoItemComparatorDeadline()),
    PRIORITY(new TodoItemComparatorPriority()),
    DESCRIPTION(new TodoItemComparatorDescription());

    private final Comparator<TodoItem> comparator;

    SortingType(Comparator<TodoItem> comparator) {
        this.comparator = comparator;
    }

    public Comparator<TodoItem> getComparator() {
        return comparator;
    }
}
